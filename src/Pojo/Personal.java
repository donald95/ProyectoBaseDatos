package Pojo;
// Generated 01-jul-2017 17:29:13 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private Integer idPersonal;
     private Usuario usuario;
     private String tipoPersonal;
     private String tituloProfesional;
     private String fechaNacimiento;
     private String estadoCivil;
     private Date fechaContratacion;
     private String cedula;
     private String primerNombre;
     private String segundoNombre;
     private String primerApellido;
     private String segundoApellido;
     private Set tecnicolaboratorios = new HashSet(0);
     private Set tecnicoenfermerias = new HashSet(0);
     private Set medicos = new HashSet(0);

    public Personal() {
    }

    public Personal(Usuario usuario, String tipoPersonal, String tituloProfesional, String fechaNacimiento, String estadoCivil, Date fechaContratacion, String cedula, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Set tecnicolaboratorios, Set tecnicoenfermerias, Set medicos) {
       this.usuario = usuario;
       this.tipoPersonal = tipoPersonal;
       this.tituloProfesional = tituloProfesional;
       this.fechaNacimiento = fechaNacimiento;
       this.estadoCivil = estadoCivil;
       this.fechaContratacion = fechaContratacion;
       this.cedula = cedula;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.tecnicolaboratorios = tecnicolaboratorios;
       this.tecnicoenfermerias = tecnicoenfermerias;
       this.medicos = medicos;
    }
   
    public Integer getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTipoPersonal() {
        return this.tipoPersonal;
    }
    
    public void setTipoPersonal(String tipoPersonal) {
        this.tipoPersonal = tipoPersonal;
    }
    public String getTituloProfesional() {
        return this.tituloProfesional;
    }
    
    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Date getFechaContratacion() {
        return this.fechaContratacion;
    }
    
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getPrimerNombre() {
        return this.primerNombre;
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return this.segundoNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public Set getTecnicolaboratorios() {
        return this.tecnicolaboratorios;
    }
    
    public void setTecnicolaboratorios(Set tecnicolaboratorios) {
        this.tecnicolaboratorios = tecnicolaboratorios;
    }
    public Set getTecnicoenfermerias() {
        return this.tecnicoenfermerias;
    }
    
    public void setTecnicoenfermerias(Set tecnicoenfermerias) {
        this.tecnicoenfermerias = tecnicoenfermerias;
    }
    public Set getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Set medicos) {
        this.medicos = medicos;
    }




}

