package com.mp.dto;

import java.io.Serializable;

public class MedicineDto implements Serializable {

	private String medicineName;
	private String manufacturer;
	private float price;
	private int quantity;

	@Override
	public String toString() {
		return "MedicineDto [medicineName=" + medicineName + ", manufacturer=" + manufacturer + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
