package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;

@Entity
@Table
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private boolean isOcManana;
    private boolean isOcTarde;
    private boolean isOcTodoDia;

    public Estado() {
    }

    public Estado(Integer id, boolean isOcManana, boolean isOcTarde, boolean isOcTodoDia) {
        this.id = id;
        this.isOcManana = isOcManana;
        this.isOcTarde = isOcTarde;
        this.isOcTodoDia = isOcTodoDia;
    }

    public Integer getId() {
        return id;
    }

    public boolean isOcManana() {
        return isOcManana;
    }

    public boolean isOcTarde() {
        return isOcTarde;
    }

    public void setOcManana(boolean isOcManana) {
        this.isOcManana = isOcManana;
    }

    public void setOcTarde(boolean isOcTarde) {
        this.isOcTarde = isOcTarde;
    }

    public boolean isOcTodoDia() {
        return isOcTodoDia;
    }

    public void setOcTodoDia(boolean isOcTodoDia) {
        this.isOcTodoDia = isOcTodoDia;
    }
}

