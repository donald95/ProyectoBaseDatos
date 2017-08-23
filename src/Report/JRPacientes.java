/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import Pojo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JDonald
 */
public class JRPacientes implements JRDataSource {

    private final List<Paciente> list = new ArrayList<>();
    private int index = -1;

    @Override
    public boolean next() throws JRException {
        return ++index < list.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {

        Object obj = null;

        if ("Numero_De_Expediente".equals(jrf.getName())) {
            obj = String.valueOf(list.get(index).getNumeroExpediente());
        }

        if ("Primer_Nombre".equals(jrf.getName())) {
            obj = String.valueOf(list.get(index).getNombre());
        }

        if ("Segundo_Nombre".equals(jrf.getName())) {
            obj = String.valueOf(list.get(index).getSegundoNombre());
        }

        if ("Primer_Apellido".equals(jrf.getName())) {
            obj = String.valueOf(list.get(index).getApellido());
        }

        if ("Segundo_Apellido".equals(jrf.getName())) {
            obj = String.valueOf(list.get(index).getSegundoApellido());
        }

        return obj;

    }

    public void addPaciente(Paciente p) {
        this.list.add(p);
    }

    public void clean() {
        if (index == -1) {
            index = -1;
        } else {
            index -= 1;
        }

    }

}
