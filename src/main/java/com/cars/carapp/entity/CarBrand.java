package com.cars.carapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class CarBrand {


	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="model")
	private String model;
	
	@Column(name="year")
	private int year;


	@Column(name="no_of_kms")
	private int no_of_kms;
	
	@Column(name="price")
	private double price;
	
	@Column(name="fuel")
	private String fuel;

	public CarBrand() {}
	
	public CarBrand(Integer id, String brand, String model, int year, int no_of_kms, double price, String fuel) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.no_of_kms = no_of_kms;
		this.price = price;
		this.fuel = fuel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNo_of_kms() {
		return no_of_kms;
	}

	public void setNo_of_kms(int no_of_kms) {
		this.no_of_kms = no_of_kms;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "CarBrand [id=" + id + ", brand=" + brand + ", model=" + model + ", year=" + year + ", no_of_kms="
				+ no_of_kms + ", price=" + price + ", fuel=" + fuel + "]";
	}
	
}
