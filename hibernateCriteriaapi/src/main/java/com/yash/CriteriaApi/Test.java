package com.yash.CriteriaApi;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Test 
{
	 public static void main(String[] args) {  
	      
	        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate_cfg.xml").build();  
	        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	          
	        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        Session session=factory.openSession();  
	          
	        Transaction t=session.beginTransaction();
	        /**
	         * all  Criteria Api
	         */
	        
	        CriteriaBuilder cb=session.getCriteriaBuilder();
	        CriteriaQuery<Customer> cq=cb.createQuery(Customer.class);
	        Root<Customer> cust=cq.from(Customer.class);
	       /**
	        * select query for list object by using  Criteria Api
	        */
	       /* cq.select(cust);
	        Query q=session.createQuery(cq);
	        List<Customer> list=q.getResultList();
	         for(Customer customer:list)
	         {
	        	 //System.out.println(customer.getItem());
	        	 //System.out.println(customer.getName());
	         }*/
	        
	        /**
	         * select query for single object
	         */
	        
	       /* cq.select(cust).where(cb.equal(cust.get("id"),1));
	         Query q=session.createQuery(cq);
	         Customer c1=new Customer();
	         c1=(Customer) q.getSingleResult();
	         System.out.println(c1.getName());*/
	         /**
	          * list for data element 
	          */
	       /* cq.multiselect(cust.get("name"));
	        Query q=session.createQuery(cq);
	        List<String> list=q.getResultList();
	        for(String name:list) 
	        {
	           System.out.println(name);	
	        }*/
	        /**
	         * OrderBy 
	         * 
	         */
	          cq.select(cust);
	          cq.orderBy(cb.asc(cust.get("name")));
	          Query q=session.createQuery(cq);
	          List<Customer> list=q.getResultList();
	          for(Customer customer:list) 
		        {
		           System.out.println("cust name="+customer.getName()+"\t Id="+customer.getId());	
		        }
	        
	         t.commit();
	         
	         session.close();
	       
	       
	        
	        
	        
	 }
}