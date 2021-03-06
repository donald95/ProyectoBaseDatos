package Pojo;
// Generated 01-jul-2017 17:29:13 by Hibernate Tools 4.3.1



/**
 * Planificacion generated by hbm2java
 */
public class Planificacion  implements java.io.Serializable {


     private int idPlanificacion;
     private Medicamento medicamento;
     private Paciente paciente;
     private String periodo;

    public Planificacion() {
    }

	
    public Planificacion(int idPlanificacion) {
        this.idPlanificacion = idPlanificacion;
    }
    public Planificacion(int idPlanificacion, Medicamento medicamento, Paciente paciente, String periodo) {
       this.idPlanificacion = idPlanificacion;
       this.medicamento = medicamento;
       this.paciente = paciente;
       this.periodo = periodo;
    }
   
    public int getIdPlanificacion() {
        return this.idPlanificacion;
    }
    
    public void setIdPlanificacion(int idPlanificacion) {
        this.idPlanificacion = idPlanificacion;
    }
    public Medicamento getMedicamento() {
        return this.medicamento;
    }
    
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }




}


