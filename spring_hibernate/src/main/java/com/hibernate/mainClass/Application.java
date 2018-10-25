package com.hibernate.mainClass;

import com.entity.Address;
import com.entity.Author;
import com.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        for (int i = 1; i < 5; i++) {
            Author author = new Author("John" + i, "Snow" + i, 24 + i, new Date());
            Address address = new Address(33 + i, "Delhi" + i, "Rohini" + i);
            author.setAddress(address);

            //TODO:13) Persist 3 subjects for each author.
            author.setSubjects(Arrays.asList("Java", "Algorithm", "Data Structure"));

            Book book1 = new Book();
            book1.setBookName("Meluha");
            Book book2 = new Book();
            book2.setBookName("Alchemist");
            Book book3 = new Book();
            book3.setBookName("Harry Potter");


            author.getBooks().add(book1);
            author.getBooks().add(book2);
            author.getBooks().add(book3);
            // Set<Book> bookSet = new HashSet<>();
//            bookSet.add(book1);
//            bookSet.add(book2);
//            bookSet.add(book3);

            /*One to Many Bidirectional*/
            book1.setAuthor(author);
            book2.setAuthor(author);
            session.save(book1);
            session.save(book2);
            session.save(book3);
            session.save(author);
        }
        session.getTransaction().commit();
        session.close();
    }
}
