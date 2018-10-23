package com.hibernate.mainClass;

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

        for (int i = 11; i < 15; i++) {
            Author author = new Author(i, "John" + i, "Snow" + i, 24 + i, new Date());
            session.save(author);
        }
        session.getTransaction().commit();

    }
}
