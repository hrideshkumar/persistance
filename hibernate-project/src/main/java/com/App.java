package com;

import java.text.MessageFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	 final Configuration configuration = new Configuration().configure();
         final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
         final SessionFactory factory = configuration.buildSessionFactory(builder.build());
         final Session session = factory.openSession();
         final AnotationBook book = new AnotationBook("93939398948 ", "Java 8", "Author");
         session.beginTransaction();
         session.save(book);
         session.getTransaction().commit();
         final List<AnotationBook> books = session.createCriteria(Book.class).list();
         System.out.println("\n----\n");
         System.out.println(MessageFormat.format("Storing {0} books in the database", books.size()));
         for (final AnotationBook b : books) {
             System.out.println(b);
         }
         System.out.println("\n----\n");
         session.close();
         factory.close();
    }
}
