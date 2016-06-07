package com.manytoone.unidirectonal1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employee;
import com.utils.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("Application Start..");
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Dog dog1 = new Dog("tomy");
		Dog dog2 = new Dog("romy");
		
		ArrayList<Dog> dg = new ArrayList<>();
		dg.add(dog1);
		dg.add(dog2);
		
		Customer customer = new Customer();
		customer.setName("Himanshu");
		customer.setDogs(dg);
		session.save(customer);
		
		 /*Student1 student1 = new Student1("Sam","Disilva","Maths");
	       Student1 student2 = new Student1("Joshua", "Brill", "Science");
	        Student1 student3 = new Student1("Peter", "Pan", "Physics");
	         
	        University university = new University("CAMBRIDGE", "ENGLAND");
	 
	        student1.setUniversity(university);
	        student2.setUniversity(university);
	        student3.setUniversity(university);
	        
	        
	        
	        session.persist(university);
	        session.persist(student1);
	        session.persist(student2);
	        session.persist(student3);*/
		
		/*session.getNamedQuery("findUnversityById");
		
		Query query = session.getNamedQuery("findUnversityById");  
	    query.setInteger("id", 4); 
	          
	    List<University> students=query.list();  
	         
	       // List<University> students = (List<University>)session.createQuery("from University a where a.is =4").list();
	        for(University s: students){
	            System.out.println("Details : "+s);
	            System.out.println("Student University Details: "+s.getStudents());
	        }
	         */
	        session.getTransaction().commit();
	        session.close();  
		
	}
}
