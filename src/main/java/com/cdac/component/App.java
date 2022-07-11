package com.cdac.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//model or entity classes are not instantiated using spring
		//CarPartsInventory inv=(CarPartsInventory) ctx.getBean("carParts1");//conecting carpart inventory ref which gives carpartsInventory object
		//model/entity classes are not instantiated using Spring
				/*CarPart cp = new CarPart();//connecting carpart class
				cp.setPartName("Seat Cover");
				cp.setCarModel("Maruti 800");
				cp.setPrice(500);
				cp.setQuantity(75);VERSION 1 CODE
				
				inv.addNewParts(cp);//connecting carpart class to CarPartsInventory which is implemented by CarpartsInventoryImpl1*/
		
		//VERSION 2 CODE
CarPartsInventory inv = (CarPartsInventory) ctx.getBean("carParts2");
		
		//model/entity classes are not instantiated using Spring
		CarPart cp = new CarPart();
		cp.setPartName("Seat Cover");
		cp.setCarModel("Maruti 800");
		cp.setPrice(500);
		cp.setQuantity(75);
		
		long ms1 = System.currentTimeMillis();
		inv.addNewParts(cp);
		long ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
		
		 ms1 = System.currentTimeMillis();
		inv.addNewParts(cp);
		 ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
		
		ms1 = System.currentTimeMillis();
		inv.addNewParts(cp);
		 ms2 = System.currentTimeMillis();
		System.out.println("Total time taken : " + (ms2 - ms1) + " ms approx");
	}

}
