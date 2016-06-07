package com.main;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Account;
import com.model.Employee;
import com.model.Student;
import com.utils.HibernateUtil;

public class OneToOneBidirectonal {

	public static void main(String[] args) {

		System.out.println("Hibernate One-To-One example (Annotation)");

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Student student = new Student("kumar@gmail.com", "kumar");
		Account account = new Account(999999); 

		student.setAccount(account);
		account.setStudent(student);

		session.save(student);
		session.save(account);

		List<Account> employees = session.createQuery("from Account").list();
		for (Account employee1 : employees) {
			System.out.println(employee1.toString());
		}

		session.getTransaction().commit();
		session.close();

	}

}
