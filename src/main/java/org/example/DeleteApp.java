package org.example;

import org.example.config.HibernateUtils;
import org.example.model.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteApp {

    public static void main(String[] args) {


        Session session = HibernateUtils.getSessionFactory().openSession();

        Student student = session.get(Student.class, 1);
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();

    }
}
