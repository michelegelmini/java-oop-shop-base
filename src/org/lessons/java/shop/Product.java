package org.lessons.java.shop;

import java.util.Random;


public class Product {

	//variabili della classe
	int code = generateCode();
	String name;
	String description;
	int price;
	int iva;
	
	Product(int code, String name, String description, int price, int iva) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.iva = iva;
		
	}
	
	public static int generateCode() {
		Random r = new Random();
		int max = 10;
		int result = r.nextInt(max);
		return result;
	}
	

	
}

