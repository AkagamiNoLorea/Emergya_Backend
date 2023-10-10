package Emergya.Emergya_B.domain.models;


@Entity
@Table
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

public class Oficina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreOficina;
    private Integer numeroAsientos;
    private String planoDistribucion;
    private Integer diasAntelacion;

    public Oficina(){

    }

    public Oficina(Long id, String nombreOficina, Integer numeroAsientos, String planoDistribucion, Integer diasAntelacion) {
        this.id = id;
        this.nombreOficina = nombreOficina;
        this.numeroAsientos = numeroAsientos;
        this.planoDistribucion = planoDistribucion;
        this.diasAntelacion = diasAntelacion;
    }

    public Oficina(String nombreOficina, Integer numeroAsientos, String planoDistribucion, Integer diasAntelacion) {
        this.nombreOficina = nombreOficina;
        this.numeroAsientos = numeroAsientos;
        this.planoDistribucion = planoDistribucion;
        this.diasAntelacion = diasAntelacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    public Integer getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(Integer numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getPlanoDistribucion() {
        return planoDistribucion;
    }

    public void setPlanoDistribucion(String planoDistribucion) {
        this.planoDistribucion = planoDistribucion;
    }

    public Integer getDiasAntelacion() {
        return diasAntelacion;
    }
    public void setDiasAntelacion(Integer diasAntelacion) {
        this.diasAntelacion = diasAntelacion;
    }
}
