package Emergya.Emergya_B.domain.models;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "reserva") //Nombre de la tabla en la base de datos
public class Usuariopuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_usuario") // Nombre de la columna "id_usuario"
    private Integer idUsuario; // Nuevo campo para la relación con Usuario

    @Column(name = "id_puesto")
    private Integer idPuesto;

    private String FranjaHorario;

    private Date Fecha;

    @ManyToOne
    @JoinColumn(name = "id_Usuario", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_Puesto", insertable = false, updatable = false) // Nombre de la columna en la tabla "puesto"
    private Puesto puesto;

    public Usuariopuesto(){
    }



    public Usuariopuesto(Integer id, Integer idUsuario, Integer idPuesto, String FranjaHorario, Date Fecha) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idPuesto = idPuesto;
        this.FranjaHorario = FranjaHorario;
        this.Fecha = Fecha;
    }

    public Usuariopuesto( Integer idUsuario, Integer idPuesto, String FranjaHorario, Date Fecha) {
        this.idUsuario = idUsuario;
        this.idPuesto = idPuesto;
        this.FranjaHorario = FranjaHorario;
        this.Fecha = Fecha;
    }



    public Integer getId () { return id;
    }

    public Integer getIdUsuario() { return idUsuario;
    }

    public Integer getIdPuesto() { return idPuesto;
    }

    public String getFranjaHorario() { return FranjaHorario;
    }

    public Date getFecha() { return Fecha;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdPuesto(Integer idPuesto) {this.idPuesto = idPuesto;}

    public void setFranjaHorario(String franjaHorario) {FranjaHorario = franjaHorario;}

    public void setFecha(Date fecha) {Fecha = fecha;}
}
