package com.hibernate.domain;

import com.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

//        TODO:Use hbm2dll update to insert at least 4 records for Author.
        for (int i = 1; i < 5; i++) {
            Author author = new Author(i, "John" + i, "Snow" + i, 24 + i, new Date());
            session.save(author);
        }
        session.getTransaction().commit();

//        TODO:Perform hbm2dll create-drop by closing session factory.
        session.close();
        sessionFactory.close();
    }
}
