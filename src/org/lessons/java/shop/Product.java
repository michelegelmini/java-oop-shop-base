package org.lessons.java.shop;

import java.util.*;


public class Product {

	//variabili della classe
	int code;
	String name;
	String description;
	double price;
	int iva;
	double finalPrice;
	
	int generateCode() {
		Random r = new Random();
		int max = 10000;
		int result = r.nextInt(max);
		return result;
	}
	
	
	Product(String name, String description, double price, int iva) {
		this.code = generateCode();
		this.name = name;
		this.description = description;
		this.price = price;
		this.iva = iva;
		this.finalPrice = price += price*iva/100;
		}
}
	
	