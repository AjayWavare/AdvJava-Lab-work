package mavenfiles;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class CustomerAddressDao {

	public void add(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(cust); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}

	public void update(Customer cust) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.merge(cust); //merge will generate update query
		
		tx.commit();
		emf.close();
	}
	

	public Customer fetchcustomer(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Customer emp = em.find(Customer.class, id);//this will return Customer type of obj n recieved in emp 
		emf.close();
		return emp;	
	}
	
	
	public void add(Adress addr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(addr); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	
	public List<Customer> fetchcustomersbyemail(String domain) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select c from Customer c where c.email like :em");
		q.setParameter("em", "%" + domain + "%");
		List<Customer>list=q.getResultList();
		emf.close();
		return list;
	}
	
	//joins
	// adressdata from customer as city is in adress table(FK IS IN CUSTOMER TBL)
	public List<Customer> fetchcustomersbycity(String city) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select c from Customer c join c.address a where a.city like :ctx");//address is object of class Adress declared in Customer class but Customer is a class
		q.setParameter("ctx",city);
		List<Customer>ct=q.getResultList();
		emf.close();
		return ct;
		}

	public Adress fetchAdress(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		
		Adress addr = em.find(Adress.class, id);//this will return Customer type of obj n recieved in emp 
		emf.close();
		return addr;	
	}
	//--------------------------------------------------------------
	//geting adress by name ( adress data from customer)
	public Adress fetchAddressByCustomerName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select a from Customer c join c.address a where c.name = :nm");
		q.setParameter("nm", name);//printing data of adress tbl for name in customer tbl
		Adress addr = (Adress) q.getSingleResult();
		
		emf.close();

		return addr;
	}
}
