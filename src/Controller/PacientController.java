/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import Pojo.Paciente;

/**
 *
 * @author JDonald
 */
public class PacientController {

    public List<Object> getPacientRecords() {

        Paciente obj = new Paciente();

        return obj.getPacientRecords();
    }
    
    
    public List<Paciente> getPacientReports(){
        
        Paciente obj = new Paciente();
        
        return obj.getPacientReports();
    }

}
