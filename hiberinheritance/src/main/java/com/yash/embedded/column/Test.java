package com.yash.embedded.column;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

public class Test 
{
	  public static void main(String args[]) 
	    {  
	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate3_cfg.xml").build();  
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();  
	          
	         Transaction t=session.beginTransaction();    
	         empbankAccountAdd add = new empbankAccountAdd("rahul soc","pune","maharashtra","s1002","lBKL00025"); 
	         EmployeeEmbedded emp  = new EmployeeEmbedded(1,"usha",add);  
	           session.save(emp);    
	            
	                
	            t.commit();    
	            session.close();    
	            System.out.println("success");        
	    }  
	}  
