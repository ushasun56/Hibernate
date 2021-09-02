package com.yash.Mapping1to1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestPerson 
{
	 public static void main(String[] args) {  
	      
	        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate6_cfg.xml").build();  
	        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();  
	          
	        Transaction t=session.beginTransaction(); 
	        
	        PersonDetail pd=new PersonDetail();
	        pd.setZipcode("21345");
	        pd.setJob("devloper");
	        pd.setIncome(60000.00);
	        

	        PersonDetail pd1=new PersonDetail();
	        pd1.setZipcode("21345");
	        pd1.setJob("devloper");
	        pd1.setIncome(60000.00);
	        
	        
	        Person p=new Person();
	        p.setPersonName("soham more");
	        
	        Person p1=new Person();
	        p1.setPersonName("usha more"); 
	        
	        p.setpDetail(pd); 
	        
	        session.save(p);
	        //no need if we set cascadetype
	        //session.save(pd);
	        
	        session.getTransaction().commit(); 
	        System.out.println("success");
	         
	        
	        

}          
}
