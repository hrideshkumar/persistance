package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.utils.HibernateUtil;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Application Start..");
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		

		Stock stock = new Stock();
	        stock.setStockCode("7052");
	        stock.setStockName("PADINI");
	 
	        Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
	        Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");
	    
	        Set<Category> categories = new HashSet<Category>();
	        categories.add(category1);
	        categories.add(category2);
	        
	        stock.setCategories(categories);
	        
	        session.save(stock);
	    
		session.getTransaction().commit();
		System.out.println("Done");
	}

}
