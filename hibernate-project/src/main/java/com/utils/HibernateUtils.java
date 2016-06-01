package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static final Session session = buildSessionFactory();
	
	private static Session buildSessionFactory() {
		final Configuration configuration = new Configuration().configure();
		final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		final SessionFactory factory = configuration.buildSessionFactory(builder.build());
		final Session session = factory.openSession();
		return session;
		
	}
	
	public static Session getSession() {
        return session;
    }

}
