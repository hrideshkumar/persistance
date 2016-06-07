package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Cart;
import com.model.Items;
import com.utils.HibernateUtils;

public class SelectQuery {
	
	public static void main(String[] args) {
		
	
		final Session session = HibernateUtils.getSession();
		String hql = "FROM com.model.Cart";
		Query query = session.createQuery(hql);
		List<Cart> results = query.list();
		for (Cart object : results) {
			System.out.println("print: "+object.print());
			
		}
	}

}
