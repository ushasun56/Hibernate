package com.yash.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;

public class Test 
{
	 public static void main(String[] args) {  
	      
	        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate1_cfg.xml").build();  
	        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();  
	          
	        Transaction t=session.beginTransaction(); 
      
	        /*----------------------------one to many mapping--------------------------*/
	     /*   Item i=new Item();
	        i.setiName("dogal");
	        i.setIprice(3500.0);
	        i.setQuntity(4);
	        
	        Item i1=new Item();
	        i1.setiName("file folder");
	        i1.setIprice(150.0);
	        i1.setQuntity(3);
	        
	        Item i2=new Item();
	        i2.setiName("pen stand");
	        i2.setIprice(250.0);
	        i2.setQuntity(3);
	        
	        Item i3=new Item();
	        i3.setiName("bag");
	        i3.setIprice(1540.0);
	        i3.setQuntity(3);
	        
	        List<Item> list = new ArrayList<Item>();
	        list.add(i);
	         list.add(i1);
	         
	         List<Item> list1 = new ArrayList<Item>();
		        list1.add(i2);
		        list1.add(i3);
		        
		        Customer c=new Customer();
     	        c.setName("swati");
	             c.setItem(list);
		        
		        
		       Customer c1=new Customer();
	              c1.setName("swapnali");
                 c1.setItem(list1);    */  
	          
	        /**
	         * delete on set null in cascade
	         * result should be only refernce entry delete not all row delete related table data is not delete
	         */
	            /* Customer c1=new Customer();
	            c1.setId(2);
                session.delete(c1);*/
		        
		   /*   session.save(c);
		       session.save(c1);*/
		        /**
		         * on delete cascade (row delete)
		         * want to delete customer id 2 excepted result it
		         *  will be delete id 2 from item table because of  table cascade
		         */
		   /* Customer c=session.find(Customer.class, 2);
	        session.remove(c);*/
		     //  session.update(c1);
	        
	        /**
	         * Criteria Api in Hibernate but createCriteria is deprecated 
	         * 
	         */
	        
	        
	     /*  Criteria c=session.createCriteria(Customer.class);
	       
	       c.add(Restrictions.eq("name","swati"));
	        List<Customer> Customer=c.list();
	       
	        for(Customer c1:Customer)
	        {
	        	System.out.println(c1);
	        }*/
	        
		        t.commit();
		        
		        System.out.println("successfully saved"); 
		     
		        session.close();
		     // System.out.println(c.getItem().size());
		       
		        
		        
		        
//	        

}
}
