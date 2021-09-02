package com.yash.table.per.concrete;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class Test {  
   
    public static void main(String[] args) {  
      
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate1_cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
          
        Transaction t=session.beginTransaction();  
          
        //Employee e1=new Employee();  
       // e1.setName("anvit gaikwad");  
          
//        Regular_Employee e2=new Regular_Employee();  
//        e2.setName("swati");  
//        e2.setSalary(10000);  
//        e2.setBonus(6);  
          
        Contract_Employee e3=new Contract_Employee();  
        e3.setName("swapnali gaikwad");  
        e3.setPay_per_hour(1000);  
        e3.setContract_duration("15 hours");  
          
       // session.persist(e1);  
        session.persist(e3);  
       // session.persist(e3);  
          
        t.commit();  
        session.close();  
        System.out.println("success");        
    }  
}  