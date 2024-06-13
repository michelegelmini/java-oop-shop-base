package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product iPhone18SuperUltra = new Product("iPhone 18 SuperUltra", "L'iPhone grosso più grosso più bello di sempre", 1499.99, 22); 
		

		System.out.println("----------------------------------------------");
		
		System.out.println("Codice prodotto = " + iPhone18SuperUltra.code);
		System.out.println("Nome prodotto = " + iPhone18SuperUltra.name);
		System.out.println("Descrizione prodotto = " + iPhone18SuperUltra.description);
		System.out.println("Prezzo prodotto = " + "€" + iPhone18SuperUltra.price);
		System.out.println("Di cui IVA = " + iPhone18SuperUltra.iva + "%");
		System.out.println("Costo totale prodotto = " + "€" + (String.format("%,.2f", iPhone18SuperUltra.finalPrice)));
		
		System.out.println("----------------------------------------------");
	
	
		Product cavettoUniversale = new Product("Cavetto Universale PRO", "Il cavetto più potente del mondo", 15.49, 22);
		
		System.out.println("Codice prodotto = " + cavettoUniversale.code);
		System.out.println("Nome prodotto = " + cavettoUniversale.name);
		System.out.println("Descrizione prodotto = " + cavettoUniversale.description);
		System.out.println("Prezzo prodotto = " + "€" + cavettoUniversale.price);
		System.out.println("Di cui IVA = " + cavettoUniversale.iva + "%");
		System.out.println("Costo totale prodotto = " + "€" + (String.format("%,.2f", cavettoUniversale.finalPrice)));
	

		System.out.println("----------------------------------------------");
		
		Product farinaBioSuperEtica = new Product("Farina Bio Super Etica", "La farina senza violenza", 15.49, 5);
		
		System.out.println("Codice prodotto = " + farinaBioSuperEtica.code);
		System.out.println("Nome prodotto = " + farinaBioSuperEtica.name);
		System.out.println("Descrizione prodotto = " + farinaBioSuperEtica.description);
		System.out.println("Prezzo prodotto = " + "€" + farinaBioSuperEtica.price);
		System.out.println("Di cui IVA = " + farinaBioSuperEtica.iva + "%");
		System.out.println("Costo totale prodotto = " + "€" + (String.format("%,.2f", farinaBioSuperEtica.finalPrice)));
	

		System.out.println("----------------------------------------------");
	
}
	}
