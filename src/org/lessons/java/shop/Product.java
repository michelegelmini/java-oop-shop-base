package org.lessons.java.shop;

import java.util.*;


public class Product {

	//variabili della classe
	String code;
	String name;
	String description;
	double price;
	int iva;
	double finalPrice;
	
	//costruttore
	Product(String name, String description, double price, int iva) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.iva = iva;
		this.finalPrice = price += price*iva/100;
		this.code = generateCode();
		}
	
	//metodo per la generazione del codice prodotto
	String generateCode() {
		Random r = new Random();
		int max = 10000;
		int result = r.nextInt(max);
	
	//caratteri speciali sulla base del valore dell'IVA	
		String specialCode;
		if (iva >= 22) {
			specialCode = "FF";
		} else {
			specialCode = "CC";
		}
		
		return (specialCode +result);
	}
	
}
	
	