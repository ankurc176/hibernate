package org.example;

import org.example.config.HibernateUtils;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadApp {

    public static void main(String[] args) {


        Session session = HibernateUtils.getSessionFactory().openSession();

        session.beginTransaction();
        Student student = session.get(Student.class, 1);
        System.out.println(student);
        session.getTransaction().commit();

    }

}
