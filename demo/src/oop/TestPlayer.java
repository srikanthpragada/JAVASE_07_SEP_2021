package oop;

abstract class Player {
	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	public void print() {
		System.out.println(this.name);
	}

	public abstract int getPoints();
		
}

class Cricketer extends Player {
	private int runs;

	public Cricketer(String name, int runs) {
		super(name);
		this.runs = runs;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.runs);
	}

	public int getPoints() {
		return this.runs / 100;
	}
}

class Footballer extends Player {
	private int matches;

	public Footballer(String name, int matches) {
		super(name);
		this.matches = matches;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.matches);
	}

	public int getPoints() {
		return this.matches / 2;
	}
}

public class TestPlayer {

	public static void main(String[] args) {
		// Compile-time polymorphism
		System.out.println(10);
		System.out.println("Abc");
		
		Player p = new Cricketer("Abc", 3939); // Upcasting
		p.print(); // Runtime polymorphism
		System.out.println(p.getPoints());

		p = new Footballer("Pqr", 110);
		p.print(); // Runtime polymorphism
		System.out.println(p.getPoints());
	}

}
