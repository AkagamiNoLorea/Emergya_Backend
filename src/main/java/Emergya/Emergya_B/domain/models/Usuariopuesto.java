package Emergya.Emergya_B.domain.models;


import jakarta.persistence.*;
import org.jetbrains.annotations.Contract;

@Entity
@Table

public class Usuariopuesto {

    @Id
    @GeneratedValue
    private Integer id;

    private String Id_Usuario;

    private String Id_Asiento;

    private String FranjaHorario;

    public Usuariopuesto(Integer id, String id_Usuario, String id_Asiento, String FranjaHorario) {
        this.id = id;
        this.Id_Asiento = id_Asiento;
        this.Id_Usuario = id_Usuario;
        this.FranjaHorario = FranjaHorario;
    }

    public Usuariopuesto(String id_Asiento, String id_Usuario, String FranjaHorario) {
        this.Id_Asiento = id_Asiento;
        this.Id_Usuario = id_Usuario;
        this.FranjaHorario = FranjaHorario;
    }

    public Integer getId () {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
public String getId_Usuario() {
        return Id_Usuario;
}

    public void setId_Usuario(String id_Usuario) {
        Id_Usuario = id_Usuario;
    }

    public String getFranjaHorario() {
        return FranjaHorario;
    }

    public void setFranjaHorario(String franjaHorario) {
        FranjaHorario = franjaHorario;
    }

    public String getId_Asiento() {
        return Id_Asiento;
    }

    public void setId_Asiento(String id_Asiento) {
        Id_Asiento = id_Asiento;
    }

    @Contract(pure = true)
    public Usuariopuesto() {

    }

}
