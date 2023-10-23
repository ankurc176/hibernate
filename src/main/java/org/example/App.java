package org.example;

import com.sun.deploy.security.SessionCertStore;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");

        //Configuration Object
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);

        //SessionFactory = DataSource
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //Session Object
        Session session= sessionFactory.openSession();

        Student student = new Student();

        student.setStudentId(1);
        student.setStudentName("Himmat");

        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();

        System.out.println("SAVED.....");

    }
}
