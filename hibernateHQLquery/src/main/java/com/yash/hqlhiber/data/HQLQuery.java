package com.yash.hqlhiber.data;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;

/**
 * main class for employee
 * @author usha.more
 */

import org.hibernate.Session;

import com.yash.hqlhiber.domain.Employee;
import com.yash.hqlhiber.util.HibernateUtil;



public class HQLQuery 
{
	public static void main(String[] args)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		/**
		 * hql query for select statment
		 * which is select * from employee;
		 */
		/* String HQL = "from Employee";
		 Query query = session.createQuery(HQL);
		 List result = query.getResultList();
		 
		 System.out.println("\n");
		 System.out.println(result);*/
		/**
		 * sql query: select * from employee where salary >35000
		 * implimented hql query
		 */
		/* String HQL = "from Employee where salary > 35000";
		 Query query = session.createQuery(HQL);
		 List result = query.getResultList();
		 System.out.println("\n");
		 System.out.println(result);*/
		/**
		 * getting result who salary have less than and = 35000 but getting result 
		 * value on setmaxresult is decide
		 * [id=1, name=suraj, salary=30000.0, address=satara], Employee [id=2, name=komal, salary=35000.0, address=sagli], 
		 * Employee [id=4, name=prashant, salary=35000.0, address=indapur]]
		 * here set maxresult 4 but it getting value 3 result because the list of employee is 3 who have mention salary
		 */
		 /*String HQL = "from Employee where salary <= 35000";
		 Query query = session.createQuery(HQL);
		 query.setMaxResults(4);
		 List result = query.getResultList();
		 
		 System.out.println("\n");
		 System.out.println(result);*/
		/**
		 * getting firstresult and maxresult
		 */
		 String HQL = "from Employee";
		 Query query = session.createQuery(HQL);
		 query.setFirstResult(2);
		 query.setMaxResults(3);
         List result = query.getResultList();
		 
		 System.out.println("\n");
		 System.out.println(result);
		 
		 
		
		
		 
		 
		
	 //session.close();
		 System.out.println("saved sussesfully");
	}

}
