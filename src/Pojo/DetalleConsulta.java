package Pojo;
// Generated 01-jul-2017 17:29:13 by Hibernate Tools 4.3.1



/**
 * DetalleConsulta generated by hbm2java
 */
public class DetalleConsulta  implements java.io.Serializable {


     private Integer idDetalleConsulta;
     private Medicamento medicamento;
     private Integer idConsulta;

    public DetalleConsulta() {
    }

    public DetalleConsulta(Medicamento medicamento, Integer idConsulta) {
       this.medicamento = medicamento;
       this.idConsulta = idConsulta;
    }
   
    public Integer getIdDetalleConsulta() {
        return this.idDetalleConsulta;
    }
    
    public void setIdDetalleConsulta(Integer idDetalleConsulta) {
        this.idDetalleConsulta = idDetalleConsulta;
    }
    public Medicamento getMedicamento() {
        return this.medicamento;
    }
    
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public Integer getIdConsulta() {
        return this.idConsulta;
    }
    
    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }




}


