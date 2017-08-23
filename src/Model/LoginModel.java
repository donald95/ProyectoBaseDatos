/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.Session;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

/**
 *
 * @author JDonald
 */
public class LoginModel {

    public List SessionStart(String query) {

        List list;

        SessionFactory sf = NewHibernateUtil.getSessionFactory();

        Session session = sf.openSession();

        session.beginTransaction();

        Query q = session.createQuery(query);

        list = q.list();

        session.getTransaction().commit();
        session.flush();
        session.close();
        
        return list;

    }

}
