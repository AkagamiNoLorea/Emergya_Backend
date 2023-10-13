package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table
public class Puesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    private EstadoPuesto estado;

    public Puesto() {

    }
    public Puesto(int numero, EstadoPuesto estado) {
        this.numero = numero;
        this.estado = estado;
    }

    public Puesto(Long id, int numero, EstadoPuesto estado) {
        this.id = id;
        this.numero = numero;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EstadoPuesto getEstado() {
        return estado;
    }

    public void setEstado(EstadoPuesto estado) {
        this.estado = estado;
    }
}

