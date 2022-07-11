package mavenfiles;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonPassportDao {
	
	public void add(Person person) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(person); //persist method will generate insert query
		
		tx.commit();
		emf.close();
	}
	
	public List<Person> fetchPersonByPassportNo(int passportNo) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q=em.createQuery("select p from Person p join p.passport ps where ps.passportNo=:pno");
		q.setParameter("pno",passportNo);
		//typing casting is needed here
		//Person p=(Person) q.getSingleResult();//here we use getSingleResult method bco we are getting record of 1 person...but we if are geting list means record of more than 1 person
		List<Person> p=(List<Person>)q.getResultList();
		emf.close();				//then we use getResultList();
		return p;
	}
	
	
	@SuppressWarnings("unchecked")
	public void delet(Class Ajay,Object pk) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Object obj=em.find(Ajay, 1);
		em.remove(obj); 
		
		tx.commit();
		emf.close();
		
	}
	
	
}

