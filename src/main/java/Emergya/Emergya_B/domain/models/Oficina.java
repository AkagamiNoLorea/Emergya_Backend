package Emergya.Emergya_B.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Oficina {


    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String NombreOficina;

    private String Numero_asientos;

    private String Plano_distribuccion;

    private String Dias_antelacion;
    public Oficina () {
    }
    public Oficina(Integer id, String NombreOficina, String Numero_asientos, String Plano_distribuccion, String Dias_antelacion){
        this.id = id;
        this.NombreOficina = NombreOficina;
        this.Numero_asientos = Numero_asientos;
        this.Plano_distribuccion = Plano_distribuccion;
        this.Dias_antelacion = Dias_antelacion;
    }

    public Oficina(String nombreoficina, String numero_asientos, String plano_distribuccion, String dias_antelacion) {
        NombreOficina = nombreoficina;
        Numero_asientos = numero_asientos;
        Plano_distribuccion = Plano_distribuccion;
        Dias_antelacion = Dias_antelacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreOficina() {
        return NombreOficina;
    }

    public void setNombreOficina(String nombreoficina) {
        NombreOficina = nombreoficina;
    }

    public String getNumero_asientos() {
        return Numero_asientos;
    }

    public void setNumero_asientos(String numero_asientos) {
        Numero_asientos = numero_asientos;
    }

    public String getPlano_distribuccion() {
        return Plano_distribuccion;
    }

    public void setPlano_distribuccion(String plano_distribuccion) {
        Plano_distribuccion = plano_distribuccion;
    }

    public String getDias_antelacion() {
        return Dias_antelacion;
    }

    public void setDias_antelacion(String dias_antelacion) {
        Dias_antelacion = dias_antelacion;
    }

    public String getPlano_distribucion() {
        return null;
    }
}
