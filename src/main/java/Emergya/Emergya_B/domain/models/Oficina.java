package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table
public class Oficina {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String NombreOficina;

    private String Numero_asientos;

    private String Plano_distribuccion;

    private String Dias_antelacion;

    public Oficina() {

    }

    public Oficina(Integer id, String NombreOficina, String Numero_asientos, String Plano_distribuccion, String Dias_antelacion){
        this.id = id;
        this.NombreOficina = NombreOficina;
        this.Numero_asientos = Numero_asientos;
        this.Plano_distribuccion = Plano_distribuccion;
        this.Dias_antelacion = Dias_antelacion;
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

    public String getPlano_distribucion(Object planoDistribucion) {
        return null;
    }

    public String getNumeroAsientos() {
        return null;
    }

    public Object getPlanoDistribucion() {
        return null;
    }

    public String getDiasAntelacion() {
        return null;
    }

    public void setNumeroAsientos(String numeroAsientos) {
    }

    public void setPlanoDistribucion(Object planoDistribucion) {
    }

    public void setDiasAntelacion(String diasAntelacion) {
    }
}
