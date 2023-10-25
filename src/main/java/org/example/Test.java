package org.example;

import org.example.config.HibernateUtils;
import org.hibernate.SessionFactory;

public class Test {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        SessionFactory sessionFactory1 = HibernateUtils.getSessionFactory();

        System.out.println(sessionFactory+ "  "+ sessionFactory1);

    }
}
