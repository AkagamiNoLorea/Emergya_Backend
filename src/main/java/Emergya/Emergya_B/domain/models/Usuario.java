package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;
import java.util.Set;



@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;

    @Column(name = "empresa")
    private Integer empresa;

    @Column(name = "isadmin")
    private Boolean isAdmin;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String email, Integer empresa, Boolean isAdmin) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.empresa = empresa;
        this.isAdmin = isAdmin;
    }

    public Usuario(String nombre, String email, Integer empresa, Boolean isAdmin) {
        this.nombre = nombre;
        this.email = email;
        this.empresa = empresa;
        this.isAdmin = isAdmin;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Integer getEmpresa() {
        return empresa;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


}
