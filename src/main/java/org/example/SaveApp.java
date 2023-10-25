package org.example;


import org.example.config.HibernateUtils;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveApp
{
    public static void main( String[] args )
    {
        Session session = HibernateUtils.getSessionFactory().openSession();

        Student student = new Student();

        student.setStudentId(2);
        student.setStudentName("Amit");

        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();

        System.out.println("SAVED.....");

    }
}
