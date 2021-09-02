package com.yash.collection;

import java.util.ArrayList;    

import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
      
public class Test {    
 public static void main(String[] args) {    
      
     StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate5_cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
       
    Transaction t=session.beginTransaction();   
   
    ArrayList<String> list1=new ArrayList<String>(); 
    for(int i=1;i<list1.size();i++)
    {
    list1.add(1,"maharastrial wedding");
    list1.add(2,"bangali wedding");
    list1.add(2,"SouthIndian wedding");
    }
    ArrayList<String> list2=new ArrayList<String>();
    for(int i=1;i<list2.size();i++) {
    list2.add(1,"panjabi wedding");
    list2.add(1,"buddist wedding");
    }
    Organiser org1=new Organiser();    
    org1.setId(1);  
    org1.setName("anvit");
    org1.setMobileNo("12345677");
    org1.setAddress("pune");
    
    Organiser org2=new Organiser();    
    org2.setId(2);  
    org2.setName("swapnali");
    org2.setMobileNo("99089645");
    org2.setAddress("pune");
    session.persist(org1);    
    session.persist(org2);    
        
    t.commit();    
    session.close();    
    System.out.println("success");    
 }
}