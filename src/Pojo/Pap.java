package Pojo;
// Generated 01-jul-2017 17:29:13 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pap generated by hbm2java
 */
public class Pap  implements java.io.Serializable {


     private Integer idPap;
     private Paciente paciente;
     private Date fecha;
     private String observacion;

    public Pap() {
    }

    public Pap(Paciente paciente, Date fecha, String observacion) {
       this.paciente = paciente;
       this.fecha = fecha;
       this.observacion = observacion;
    }
   
    public Integer getIdPap() {
        return this.idPap;
    }
    
    public void setIdPap(Integer idPap) {
        this.idPap = idPap;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }




}

