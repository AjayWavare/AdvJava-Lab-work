package mavenfiles;

import java.time.LocalDate;
import java.util.List;

public class PersonPassportExample {

	public static void main(String[] args) {
		PersonPassportDao dao = new PersonPassportDao();
		
		Person p = new Person();
		p.setName("Swapnil");
		p.setEmail("swapnil@gmail.com");
		p.setDateOfBirth(LocalDate.of(1999, 5, 15));
		
		Passport ps = new Passport();
		ps.setIssueDate(LocalDate.of(2020, 10, 30));	
		ps.setExpiryDate(LocalDate.of(2030, 10, 30));
		ps.setIssuedBy("Govt. of India");
		
		p.setPassport(ps);
		ps.setPerson(p);
		
		dao.add(p);
		/*Person p=dao.fetchPersonByPassportNo(1);//our edited code
		System.out.println(p.getId()+""+ p. getEmail()+" "+p.getName());*/
		//List<Person> list =dao.fetchPersonByPassportNo(1);
		//System.out.println(list);//hashcode
		//for(Person p:list)
			//System.out.println(p.getName());
		dao.delet(Person.class,1);	
}
}