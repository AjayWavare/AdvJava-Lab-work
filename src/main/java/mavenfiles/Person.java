package mavenfiles;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_person")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private LocalDate dateOfBirth;
	//BIDIRECTIONAL RELATIONSHIP...
	/*The main differenece is that bidirectional relationship provides navigational access in both directions,
	 *  so that you can access the other side without explicit queries. 
	 * Also it allows you to apply cascading options to both directions*/
	
	@OneToOne(mappedBy="person", cascade=CascadeType.ALL)//jidhar cascad hai usik obj pe DML query run hogi
	private Passport passport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
}
