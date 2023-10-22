package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table(name = "puesto") // Nombre de la tabla en la base de datos
public class Puesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Nombre de la columna "id"
    private Integer id;

    @Column(name = "idOficina") // Nombre de la columna "id_oficina"
    private Integer idOficina; // Cambia el nombre de la propiedad

    @Column(name = "disponible") // Nombre de la columna "disponible"
    private Boolean disponible;

    @Column(name = "numero") // Nombre de la columna "numero"
    private Integer numero;

    @Column(name = "idEstado") // Nombre de la columna "id_estado"
    private Integer idEstado; // Nuevo campo para la relación con Estado

    @ManyToOne
    @JoinColumn(name = "idOficina", insertable = false, updatable = false) // Nombre de la columna en la tabla "puesto"
    private Oficina oficina;

    @ManyToOne
    @JoinColumn(name = "idEstado", insertable = false, updatable = false) // Nombre de la columna en la tabla "puesto"
    private Estado estado;

    public Puesto() {
    }

    public Puesto(Integer idOficina, Boolean disponible, Integer numero, Integer idEstado) {
        this.idOficina = idOficina;
        this.disponible = disponible;
        this.numero = numero;
        this.idEstado = idEstado;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdOficina() {
        return idOficina;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setOficina() {
        this.oficina = oficina;
        this.idOficina = oficina.getId();
    }


    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public void setOficina(Oficina oficina) {
    }

    public void setIdOficina(Integer idOficina) {
    }
}




