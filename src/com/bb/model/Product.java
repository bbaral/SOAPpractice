package com.bb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Bikram Baral May 19, 2018
 */
@XmlRootElement(name="Product")
@XmlType(propOrder= {"price", "sku", "name"})
public class Product {

	private String name, sku;
	private double price;

	/*
	 * custruction with no argument is required
	 * because we want JAXB to be able to create new product.
	 * If you don't have the constructor with no parameter. it wont create new object
	 */
	public Product() {}

	public Product(String name, String sku, double price) {
		this.name = name;
		this.sku = sku;
		this.price = price;
	}
	
	@XmlElement(name="ProductName", required=true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
