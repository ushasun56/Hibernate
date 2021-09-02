package com.yash.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.yash.entities.Student;


public class StoreStudentData 
{
	public static void main(String[] args) {  

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session1 = factory.openSession();
		Transaction t = session1.beginTransaction();
		
		/*Session session2 = factory.openSession();
		Transaction t1 = session2.beginTransaction();*/
		
		


		Student s= new Student();
		// s.setName("smita");
		 
	


		//session1.save(s);
		//t.commit();
		//session1.close();*/

		//*****1st level*******
		

		s=null;
		session1= factory.openSession();
		session1.beginTransaction();
		
		

		s= (Student) session1.get(Student.class, 1);
		System.out.println(s);

		s=(Student) session1.get(Student.class, 1);
		System.out.println(s);
		session1.close();
		
		Session session2= factory.openSession();
		session2.beginTransaction();
		
		s= (Student) session2.get(Student.class, 1);
		System.out.println(s);
		
		
		session2.getTransaction().commit();
		session2.close();

		System.out.println("successfully saved");
	}
}
