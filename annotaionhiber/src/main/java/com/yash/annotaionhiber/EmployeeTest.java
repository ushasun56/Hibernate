package com.yash.annotaionhiber;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class EmployeeTest 

{
   public static void main(String[] args)
   {
	   
//	   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction(); 
		
	  
	   SessionFactory factory = new Configuration().configure("hibernate_cfg.xml").buildSessionFactory();
	//     Employee e=new Employee();
//		  e.setId(2);
//		  e.setName("mayuri");
//		  e.setSalary(38000);
//	   	  e.setAddress("solapur");
		
	   Session session = factory.openSession(); 
	   org.hibernate.Transaction t = session.beginTransaction();
//		session.save(e);
		//session.update(e);
	  // session.delete(e);
	  
	 /**
	  * 
	  * fetch data from database using list and without passing object
	  */
	   /* int i=0;
        Employee emp=new Employee();
        emp=null;
        for(i=0;i<=4;i++)
        {
            emp=(Employee) session.get(Employee.class,i);
            System.out.println("\n"+emp.getId()+"\n"+emp.getName()+"\n"+emp.getSalary()+"\n"+emp.getAddress());
            
        }*/
	   /**
	    * fetch data from database using object
	    */
	   Employee e=new Employee();
	   e=(Employee) session.get(Employee.class, 1);
	   System.out.println(e);
			   
//	  
//	   emp =(Employee) session.get(Employee.class,1);
//	   System.out.println(emp);
	   
	   /**
	    * use of createCriteria() from criteria API
	    */
	  // List<Employee> employees = (List<Employee>) session.createCriteria(Employee.class).list();
	 //  System.out.println("\n"+employees);

	 
	   
	  // Employee e=session.get(Employee.class,new Integer(4));
	 //  System.out.println("\n"+e.getId()+"\n"+e.getName()+"\n"+e.getSalary()+"\n"+e.getAddress());
		
	   
	   
		t.commit();
		System.out.println("successfully saved");
		

	   
   }
	
	
	
}
