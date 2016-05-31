package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SelectQuery {
	
	public static void main(String[] args) {
		
		final Configuration configuration = new Configuration().configure();
		final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		final SessionFactory factory = configuration.buildSessionFactory(builder.build());
		final Session session = factory.openSession();
		String hql = "FROM com.Author";
		Query query = session.createQuery(hql);
		List<Author> results = query.list();
		for (Author object : results) {
			System.out.println("print: "+object);
			
		}
	}

}
