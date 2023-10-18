import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfiguracionSeguridad {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
        User.UserBuilder userBuilder = User.withUsername("usuario")
                .password(passwordEncoder.encode("password"))
                .roles("USUARIO");
        User.UserBuilder adminBuilder = User.withUsername("admin")
                .password(passwordEncoder.encode("adminpassword"))
                .roles("ADMIN");
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(userBuilder.build(), adminBuilder.build());
        return manager;
    }

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .antMatchers("/api/public/**").permitAll()
                                .antMatchers("/api/usuario/**git").hasRole("USUARIO")
                                .antMatchers("/api/admin/**").hasRole("ADMIN")
                                .anyRequest().authenticated()
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login") // Página personalizada de inicio de sesión
                                .defaultSuccessURL("/inicio") // URL de redirección después del inicio de sesión exitoso
                );

        return http.build();
    }
}

