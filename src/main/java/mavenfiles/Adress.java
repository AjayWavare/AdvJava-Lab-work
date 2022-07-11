package mavenfiles;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Adress")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name=adrrid)here if we want to change name only and   only then this method is required 
	private int addr_id;
	private String city;
	private int pincode;
	private String state;
	public int getId() {
		return  addr_id;
	}
	public void setId(int  addr_id) {
		this. addr_id =  addr_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
