/*package Emergya.Emergya_B.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Oficina {


    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String NombreOficina;

    private String Puesto;

    private String Plano_distribuccion;

    private String Dias_antelacion;
    private String puesto;

    public Oficina() {
    }

    public Oficina(Integer id, String NombreOficina, String Puesto, String Plano_distribuccion, String Dias_antelacion) {
        this.id = id;
        this.NombreOficina = NombreOficina;
        this.Puesto = Puesto;
        this.Plano_distribuccion = Plano_distribuccion;
        this.Dias_antelacion = Dias_antelacion;
    }

    public Oficina(String nombreoficina, String puesto, String plano_distribuccion, String dias_antelacion) {
        NombreOficina = nombreoficina;
        Puesto = Puesto;
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

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto() {
        String Puesto = puesto;
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

 */

package Emergya.Emergya_B.domain.models;

public class Oficina {

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
