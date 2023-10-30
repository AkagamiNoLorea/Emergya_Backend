package Emergya.Emergya_B.config.SecurityConfig;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        if ("tuUsuario".equals(username) && "tuContraseña".equals(password)) {
            return new ResponseEntity<>("Autenticación exitosa", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Autenticación fallida", HttpStatus.UNAUTHORIZED);
        }
    }
}