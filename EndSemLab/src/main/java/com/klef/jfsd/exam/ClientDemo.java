package com.klef.jfsd.exam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.persister.collection.mutation.RowMutationOperations.Restrictions;

public class ClientDemo {
    public static void main(String[] args) {
       
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        
        Customer customer1 = new Customer();
        customer1.setName("Susheel");
        customer1.setEmail("susheel@gmail.com");
        customer1.setAge(28);
        customer1.setLocation("Hyderabad");

        Customer customer2 = new Customer();
        customer2.setName("Sailu");
        customer2.setEmail("sailu@gmail.com");
        customer2.setAge(30);
        customer2.setLocation("kurnool");

        Customer customer3 = new Customer();
        customer3.setName("seetha");
        customer3.setEmail("seetha@gmail.com");
        customer3.setAge(22);
        customer3.setLocation("vijayawada");

        session.save(customer1);
        session.save(customer2);
        session.save(customer3);

        transaction.commit();

    

        session.close();
        sessionFactory.close();
    }
}
