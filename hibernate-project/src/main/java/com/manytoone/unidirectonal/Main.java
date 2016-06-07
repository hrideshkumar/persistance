package com.manytoone.unidirectonal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Account;
import com.model.Student;
import com.utils.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hibernate One-To-One example (Annotation)");

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		

		List<Account> employees = session.createQuery("from Account").list();
		for (Account employee1 : employees) {
			System.out.println(employee1.toString());
		}

		session.getTransaction().commit();
		session.close();
	}
}
