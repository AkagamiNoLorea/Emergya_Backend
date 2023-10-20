package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table

public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id") // Nombre de la columna en la base de datos
    private Integer id;

    @Column(name = "nombreoficina") // Nombre de la columna en la base de datos
    private String Nombreoficina;

    @Column(name = "puesto") // Nombre de la columna en la base de datos
    private Integer Puesto;

    @Column(name = "planodistribucion") // Nombre de la columna en la base de datos
    private String Planodistribucion;

    @Column(name = "diasantelacion") // Nombre de la columna en la base de datos
    private Integer Diasantelacion;


    public Oficina() {
    }

    public Oficina(Integer id, String nombreoficina, Integer puesto, String planodistribucion, Integer diasantelacion) {
        this.id = id;
        this.Nombreoficina = nombreoficina;
        this.Puesto = puesto;
        this.Planodistribucion = planodistribucion;
        this.Diasantelacion = diasantelacion;
    }

    public Oficina(String nombreoficina, Integer puesto, String planodistribucion, Integer diasantelacion) {
        this.Nombreoficina = nombreoficina;
        this.Puesto = puesto;
        this.Planodistribucion = planodistribucion;
        this.Diasantelacion = diasantelacion;
    }

    public Oficina(String nombreoficina, String s, String planodistribucion, String s1) {
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

    public Integer getPuesto() {
        return Puesto;
    }

    public void setPuesto(Integer puesto) {
        Puesto = puesto;
    }

    public String getPlanodistribucion() {
        return Planodistribucion;
    }

    public void setPlanodistribucion(String planodistribucion) {
        Planodistribucion = planodistribucion;
    }

    public Integer getDiasantelacion() {
        return Diasantelacion;
    }

    public void setDiasantelacion(Integer diasantelacion) {
        Diasantelacion = diasantelacion;
    }

}