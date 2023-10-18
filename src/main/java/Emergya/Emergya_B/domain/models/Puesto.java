package Emergya.Emergya_B.domain.models;
import jakarta.persistence.*;

@Entity
@Table(name = "puesto")
public class Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_oficina")
    private Integer idOficina;

    @Column(name = "disponible")
    private Boolean disponible;

    @Column(name = "numero")
    private Integer numero;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoPuesto estado;

    @ManyToOne
    @JoinColumn(name = "id_oficina", insertable = false, updatable = false)
    private Oficina oficina;

    public Puesto() {
    }

    public Puesto(Integer idOficina, Boolean disponible, Integer numero, EstadoPuesto estado) {
        this.idOficina = idOficina;
        this.disponible = disponible;
        this.numero = numero;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public EstadoPuesto getEstado() {
        return estado;
    }

    public void setEstado(EstadoPuesto estado) {
        this.estado = estado;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
}

