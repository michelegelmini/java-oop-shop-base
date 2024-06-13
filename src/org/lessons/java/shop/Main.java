package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product prodottoUno = new Product("iPhone 18 SuperUltra", "L'iPhone grosso più grosso più bello di sempre", 1499.99, 22);
		
		System.out.println("Codice prodotto = " + String.format("%05d", prodottoUno.code));
		System.out.println("Nome prodotto = " + prodottoUno.name);
		System.out.println("Descrizione prodotto = " + prodottoUno.description);
		System.out.println("Prezzo prodotto = " + "€" + prodottoUno.price);
		System.out.println("Di cui IVA = " + prodottoUno.iva + "%");
		System.out.println("Costo totale prodotto = " + "€" + (String.format("%,.2f", prodottoUno.finalPrice)));
	}

	

}
