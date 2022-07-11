package mavenfiles;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDao {

	public void add(Employee emp) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	em.persist(emp);
	tx.commit();
	emf.close();
	}
	
	public Employee fetch(int empno) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
	EntityManager em = emf.createEntityManager();
	EntityTransaction tx = em.getTransaction();

	Employee empl=em.find(Employee.class,empno);
	
	emf.close();
	return empl;
	}
	//fetching all data will return a list...
	public List<Employee> fetchAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select e from Employee e"); //HQL/JPQL
		List<Employee> list = q.getResultList();//qury is an interface and getResultlist is in built method
		//result is stored in a list
		emf.close();

		return list;
	}
	
	//fetching all names
	
	public List<String> fetchAllNames()//this will return name which are  string 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select e.name from Employee e"); //HQL/JPQL
		List<String> list= q.getResultList();
		return list;
	}
	
	public List<Object[]> fetchNameandSalaries()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(null);
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select e.name,e.salary from Employee e");
		List<Object[]> list=q.getResultList();
		return list;
	}
}
