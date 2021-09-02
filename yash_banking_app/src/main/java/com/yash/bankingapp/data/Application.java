package com.yash.bankingapp.data;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import com.yash.bankingapp.domain.User;

/**
 *
 * @author usha more
 *
 */
   
public class Application {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
//		User user = new User();
//		user.setFirstName("soham");
//		user.setLastName("More");
//		user.setBirthDate(new Date());
//		user.setEmailAddress("soham.more@yash.com");
//		user.setCreatedBy("soham");
//		user.setCreatedDate(new Date());
//		user.setLastUpdatedDate(new Date());
//		user.setLastUpdatedBy("soham");
//		session.saveOrUpdate(user);
//		session.getTransaction().commit();
//		session.close();
		System.out.println("Fetch all data from table yash_bank_user:-"+"\n");
		 List<User> user1 = (List<User>) session.createCriteria(User.class).list();
		 System.out.println(user1);
	}
}
