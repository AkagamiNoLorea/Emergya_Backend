package Emergya.Emergya_B.domain.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Oc_mañana;
    private String Oc_tarde;

    public Estado (){
    }

    public Estado (String Oc_mañana, String Oc_tarde){
        this.Oc_mañana = Oc_mañana;
        this.Oc_tarde = Oc_tarde;
    }

    public Integer getId(){
        return id;
    }
    public String getOc_mañana(){
        return Oc_mañana;
    }

    public String getOc_tarde(){
        return Oc_tarde;
    }

    public void setOc_mañana(String oc_mañana) {
        this.Oc_mañana = Oc_mañana;
    }

    public void setOc_tarde(String oc_tarde) {
        this.Oc_tarde = oc_tarde;
    }
}
