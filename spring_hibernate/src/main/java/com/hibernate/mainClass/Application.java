package com.hibernate.mainClass;

import com.entity.Address;
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
        Address address=new Address();
        for (int i = 11; i < 15; i++) {
            Author author = new Author("John" + i, "Snow" + i, 24 + i, new Date());
            address.setStreetNumber(22+i);
            address.setState("Delhi"+i);
            address.setLocation("West Delhi"+i);
            author.setAddress(address);
            session.save(author);
        }
        session.getTransaction().commit();

    }
}
