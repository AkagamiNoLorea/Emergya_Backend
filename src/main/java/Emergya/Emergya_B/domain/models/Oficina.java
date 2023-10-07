package Emergya.Emergya_B.domain.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

public class Oficina {


    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String Nombre;

    private String Número_asientos;

    private String Plano_distribucción;

    private String Días_antelación;

    public Oficina () {
    }
    public Oficina(Integer id, String Nombre, String Número_asientos, String Plano_distribucción, String Días_antelación){
        this.id = id;
        this.Nombre = Nombre;
        this.Número_asientos = Número_asientos;
        this.Plano_distribucción = Plano_distribucción;
        this.Días_antelación = Días_antelación;
    }

    public Oficina(String nombre, String número_asientos, String plano_distribucción, String días_antelación) {
        Nombre = nombre;
        Número_asientos = número_asientos;
        Plano_distribucción = plano_distribucción;
        Días_antelación = días_antelación;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNúmero_asientos() {
        return Número_asientos;
    }

    public void setNúmero_asientos(String número_asientos) {
        Número_asientos = número_asientos;
    }

    public String getPlano_distribucción() {
        return Plano_distribucción;
    }

    public void setPlano_distribucción(String plano_distribucción) {
        Plano_distribucción = plano_distribucción;
    }

    public String getDías_antelación() {
        return Días_antelación;
    }

    public void setDías_antelación(String días_antelación) {
        Días_antelación = días_antelación;
    }
}
