package Emergya.Emergya_B.domain.models;
import jakarta.persistence.*;

@Entity
@Table
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "oc_mañana")
    private Boolean Oc_mañana;
    @Column(name = "oc_tarde")
    private Boolean Oc_tarde;
    @Column(name = "oc_todoDia")
    private Boolean Oc_todoDia;

    public Estado() {
    }

    public Estado(Integer id, Boolean Oc_mañana, Boolean Oc_tarde, Boolean Oc_todoDia ) {
        this.id = id;
        this.Oc_mañana = Oc_mañana;
        this.Oc_tarde = Oc_tarde;
        this.Oc_todoDia = Oc_todoDia;
    }

    public Estado( Boolean Oc_mañana, Boolean Oc_tarde, Boolean Oc_todoDia) {
        this.Oc_mañana = Oc_mañana;
        this.Oc_tarde = Oc_tarde;
        this.Oc_todoDia = Oc_todoDia;
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

    public Boolean getOc_todoDia() {
        return Oc_todoDia;
    }

    public void setOc_todoDia(Boolean oc_todoDia) {
        Oc_todoDia = oc_todoDia;
    }

    public void setOc_mañana(Boolean Oc_mañana) {
        this.Oc_mañana = Oc_mañana;
    }

    public void setOc_tarde(Boolean Oc_tarde) {
        this.Oc_tarde = Oc_tarde;
    }
}
