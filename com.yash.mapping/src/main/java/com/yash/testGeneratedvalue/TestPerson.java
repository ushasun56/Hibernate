package com.yash.testGeneratedvalue;



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
	      
	        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();  
	        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();  
	          
	        Transaction t=session.beginTransaction(); 
//	        
//	        PersonDetail pd1=new PersonDetail();
//	        pd1.setZipcode("674536");
//	        pd1.setJob("hr");
//	        pd1.setIncome(50000.00);
	        
	        
	        

	        PersonDetail pd2=new PersonDetail();
	        pd2.setZipcode("657463");
	        pd2.setJob("Testing");
	        pd2.setIncome(65000.00);
//	        
	        
	        Person p=new Person();
	        p.setPersonName("soham more");
	        
//	        Person p1=new Person();
//	        p1.setPersonName("usha more"); 
	        
	        p.setpDetail(pd2); 
	        
	        session.save(p);
	        //no need if we set cascadetype
	        //session.save(pd);
	        
	        session.getTransaction().commit(); 
	        System.out.println("success");
	         
	        
	        

}          
}
