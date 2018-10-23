package com.hibernate.domain;

import com.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();


        //TODO:Perform CRUD operation for Author class.

        /*CREATE*/
        Author author = new Author();
        author.setId(1);
        author.setFirstName("John");
        author.setLastName("snow");
        author.setAge(27);
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

        /*READ*/
        session.get(Author.class, 1);
        System.out.println(author);

        /*UPDATE*/
        session.beginTransaction();
        author.setFirstName("Akira");
        session.update(author);
        session.getTransaction().commit();
        System.out.println(author);

        /*DELETE*/
        session.beginTransaction();
        session.delete(author);
        session.getTransaction().commit();
        System.out.println(author);
    }
}
