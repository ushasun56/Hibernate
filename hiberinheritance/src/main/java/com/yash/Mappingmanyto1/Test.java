package com.yash.Mappingmanyto1;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test 
{
	public static void main(String[] args) {    
	      
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate7_cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();
	    Employee e1=new Employee();    
	    e1.setName("soham more");    
	    e1.setEmail("soham@gmail.com");    
	      
	    Employee e2=new Employee();  
	    e2.setName("Nikita more");  
	    e2.setEmail("nikita@gmail.com");  
	    
	    Bankaddress add1=new Bankaddress();
	    add1.setAddressLine("MG road");
	    add1.setCity("pune");
	    add1.setState("Maharashtra");
        add1.setCountry("india");
        add1.setIfsccode("IBKL00250");
        add1.setPincode(411027);
        
        e1.setAddress(add1);    
        e2.setAddress(add1);
        
        session.persist(e1);    
        session.persist(e2);  
        t.commit();    
            
        session.close();    
        System.out.println("success");    
//    
	    //--------------------print data on console------------------------------------------//
	    
//	    TypedQuery query=session.createQuery("from Employee e");    
//	    List<Employee> list=query.getResultList();   
//	        
//	    Iterator<Employee> itr=list.iterator();    
//	    while(itr.hasNext()){    
//	     Employee emp=itr.next();    
//	     System.out.println(emp.getEmployeeId()+" "+emp.getName()+" "+emp.getEmail());    
//	     Bankaddress address=emp.getAddress();    
//	     System.out.println(address.getAddressLine()+" "+address.getCity()+" "+    
//	        address.getState()+" "+address.getCountry()+" "+address.getPincode()+""+address.getIfsccode());    
//	    }    
//	    
//	    session.close();    
//	    System.out.println("success");    
//  
	
     
        
}
}
