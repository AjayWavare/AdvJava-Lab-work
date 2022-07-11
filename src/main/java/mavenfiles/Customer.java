package mavenfiles;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name=" Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private int id;
	//UNIDIRECTIONAL...
	private String name;
	private String email;

	//NO NO NO NO NO NO
	//we will never keep the FK column as part of the class structure
	//private int addrId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "addr_id") //fk
	private Adress address; //has-a refrence var of class Adress...

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

	public Adress getAddress() {
		return address;
	}

	public void setAddress(Adress address) {
		this.address = address;
	}

	
}
