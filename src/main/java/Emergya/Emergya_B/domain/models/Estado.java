package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremental
    private Integer id;
    @Column(name = "oc_mañana")
    private Boolean Oc_mañana;
    @Column(name = "oc_tarde")
    private Boolean Oc_tarde;

    // Constructor vacío
    public Estado() {
    }

    // Constructor con todos los atributos
    public Estado(Integer id, Boolean Oc_mañana, Boolean Oc_tarde) {
        this.id = id;
        this.Oc_mañana = Oc_mañana;
        this.Oc_tarde = Oc_tarde;
    }

    public Estado( Boolean Oc_mañana, Boolean Oc_tarde) {
        this.Oc_mañana = Oc_mañana;
        this.Oc_tarde = Oc_tarde;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getOc_mañana() {
        return Oc_mañana;
    }

    public Boolean getOc_tarde() {
        return Oc_tarde;
    }

    // Métodos setter para establecer los valores de las propiedades

    public void setOc_mañana(Boolean Oc_mañana) {
        this.Oc_mañana = Oc_mañana;
    }

    public void setOc_tarde(Boolean Oc_tarde) {
        this.Oc_tarde = Oc_tarde;
    }
}
