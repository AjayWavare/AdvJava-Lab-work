package mavenfiles;

import java.util.List;

public class AddCustomerAndAddress {

	public static void main(String[] args) {
		CustomerAddressDao dao = new CustomerAddressDao();

		/*
		 * Customer c = new Customer(); c.setName("Ajay"); c.setEmail("ajay@gmail");
		 * dao.add(c);
		 * 
		 * Adress a = new Adress(); a.setPincode(425001); a.setCity("jalgaon");
		 * a.setState("Maharashtra"); dao.add(a);
		 */
		/*Customer c = dao.fetchcustomer(1);// fetching customer id
		Adress a = dao.fetchAdress(1);// fetching adress id
		c.setAddress(a);// adress obj we created in customer for joint now setting id
		dao.update(c);// updating adress id into customer with update method created in dao class
		// above stmt is for updating database...*/
	//-----------------------------------------------------------
	//	in this code we have seted a cascading on one 2 one relation so if we pass data in customer then aadress table will also receive data
		
		/* Customer c = new Customer();
		 c.setName("Aj");
		 c.setEmail("aj@gmail");
		 
		 Adress a = new Adress();
		 a.setPincode(425001); 
		  a.setCity("Anand");
		 a.setState("Gujrat");
		  
		 c.setAddress(a);//UNIDIRECTIONAL SO SETTING ONLY 1 OBJ ...SEE BIDIRECTION IN PASSPORT EXAMPLE...
		  dao.add(c);
		*/
		//-----------------------------------------
		//selecting customer by email getting theire id & name only
		/*List<Customer>list=dao.fetchcustomersbyemail("gmail");
		for(Customer c:list)
		System.out.println(c.getId()+" "+c.getName());*/
		//----------------------------------------------------------------
		//customer data from adress
		//fetching customer who belongs to perticular city(join is used here)
		/*List<Customer>list= dao.fetchcustomersbycity("jalgaon");
		for(Customer c:list)
			System.out.println(c.getEmail()+" "+c.getName());// from adress table  coloum ,customer's data printing*/
		//-----------------------------------------------------------------------------
			//adress data from customer

		Adress a = dao.fetchAddressByCustomerName("aj");
		System.out.println(a.getId() + " " + a.getCity() + " " + a.getPincode() + " " + a.getState());
	
	}

}
