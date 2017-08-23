/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Pojo.Paciente;
import java.util.List;
import javafx.collections.ObservableList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author JDonald
 */
public class PacientModel {

    public List<Object> getPacientRecords() {

        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();

        Criteria criteria = s.createCriteria(Paciente.class);

//                .add(Restrictions.like("nombre", "D%"));
        List<Object> list = (List<Object>) criteria.list();

//        list.stream().map((obj) -> (Paciente) obj).forEachOrdered((p) -> {
//
//            System.out.format("%15s %5s %25s %5s %30s %5s %25s %5s %25s %5s %25s %5s %25s %5s %25s\n",
//                    p.getNumeroExpediente(), "|", p.getNombre(), "|", p.getSegundoNombre(),
//                    "|", p.getApellido(), "|", p.getSegundoApellido(), "|", p.getFechaNacimiento(), "|", p.getCedula(), "|", p.getSexo());
//        });
        return list;
    }

    public List<Paciente> getPacientReports() {
        
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        Criteria c = s.createCriteria(Paciente.class);
        
        List<Paciente> list = (List<Paciente>) c.list();
        
        return list;
    }

}
