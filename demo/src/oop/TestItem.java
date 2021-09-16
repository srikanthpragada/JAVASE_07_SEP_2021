package oop;

class Item {
	// instance variables
	private String name;
	private double price;

	// Constructor 
	public Item(String n, double p) {
		name = n;
		price = p;
	}
	
	// Methods
	public double getNetPrice() {
		return  price * 1.12;  // 12% tax 
	}
	
	public String getName() {
		return name;
	}
}

public class TestItem {

	public static void main(String[] args) {
		Item p1 = new Item("Iphone 13", 78000);
		System.out.println(p1.getNetPrice());
		
		// Item p2 = new Item();
		
	}

}
