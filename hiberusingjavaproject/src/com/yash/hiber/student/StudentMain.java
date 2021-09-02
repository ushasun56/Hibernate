package com.yash.hiber.student;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class StudentMain {

	public static void main(String[] args)
	{
		
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();  
          
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		            
		    StudentApp e1=new StudentApp();    
		    e1.setId(101);    
		    e1.setName("usha");
		    e1.setLastname("more");
		    e1.setMark(75);
		    
		    session.save(e1);  
		    t.commit();  
		    System.out.println("successfully saved");    
		    factory.close();  
		    session.close();    
		        
		}    

	}


