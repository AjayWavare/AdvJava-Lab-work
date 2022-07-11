package com.cdac.component;

public class CarPart {

	
	private int PartNo;
	private String partName;
	private String CarModel;
	private double price;
	private int quantity;
	
	public int getPartNo() {
		return PartNo;
	}
	public void setPartNo(int partNo) {
		PartNo = partNo;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	
}
