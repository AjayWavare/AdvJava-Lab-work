package com.cdac.component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("carParts1")
public class CarpartsInventoryImpl1 implements CarPartsInventory {

	public void addNewParts(CarPart carPart) {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","cdac");	
			PreparedStatement st = conn.prepareStatement("insert into tbl_carpart(part_name, car_model, price, quantity) values(?, ?, ?, ?)");
			st.setString(1, carPart.getPartName());//getting carpart class method's values 
			st.setString(2, carPart.getCarModel());
			st.setDouble(3, carPart.getPrice());
			st.setInt(4, carPart.getQuantity());
			st.executeUpdate();
		}
		
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}

	public List<CarPart> getAvailableparts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
