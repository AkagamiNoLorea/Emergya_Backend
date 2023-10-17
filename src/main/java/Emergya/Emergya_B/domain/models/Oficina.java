package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table

public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String Nombreoficina;
    private String Puesto;
    private String Planodistribucion;
    private String Diasantelacion;

    public Oficina() {
    }

    public Oficina(Integer id, String nombreoficina, String puesto, String planodistribucion, String diasantelacion) {
        this.id = id;
        this.Nombreoficina = nombreoficina;
       this.Puesto = puesto;
        this.Planodistribucion = planodistribucion;
        this.Diasantelacion = diasantelacion;
    }

    public Oficina(String nombreoficina, String puesto, String planodistribucion, String diasantelacion) {
       this.Nombreoficina = nombreoficina;
        this.Puesto = puesto;
        this.Planodistribucion = planodistribucion;
        this.Diasantelacion = diasantelacion;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreoficina() {
        return Nombreoficina;
    }

    public void setNombreoficina(String nombreoficina) {
        Nombreoficina = nombreoficina;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getPlanodistribucion() {
        return Planodistribucion;
    }

    public void setPlanodistribucion(String planodistribucion) {
        Planodistribucion = planodistribucion;
    }

    public String getDiasantelacion() {
        return Diasantelacion;
    }

    public void setDiasantelacion(String diasantelacion) {
        Diasantelacion = diasantelacion;
    }
}
