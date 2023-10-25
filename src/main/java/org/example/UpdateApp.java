package org.example;

import org.example.config.HibernateUtils;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateApp {

    public static void main(String[] args) {


        Session session = HibernateUtils.getSessionFactory().openSession();


        Student student = session.get(Student.class, 1);
//        student.setStudentId(1);
        student.setStudentName("Amit");

        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();

    }

}
