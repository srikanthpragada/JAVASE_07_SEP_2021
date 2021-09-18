package oop;

class Product {
	// instance variables
	private String name;
	private double price;
	private int qoh;
	// static variable or class variable
	private static double taxrate = 12;
	
	public double getTaxRate() {
		return  taxrate;
	}

	// Default constructor
	public Product() {

	}

	// methods
	public void set(String n, double p) {
		name = n;
		price = p;
	}

	public double getNetPrice() {
		return price * taxrate / 100 + price;
	}

	public String getName() {
		return name;
	}

	public void sell(int qty) {
		qoh -= qty;
	}

	public void purchase(int qty) {
		qoh += qty;
	}

}

public class TestProduct {

	public static void main(String[] args) {
		Product p1; // object reference

		p1 = new Product(); // object
		p1.set("Iphone 13", 78000);
		System.out.println(p1.getNetPrice());

		Product p2 = new Product();
		// p2.set("Apple Watch Series 7", 34000);
		System.out.println(p2.getNetPrice());
	}

}
