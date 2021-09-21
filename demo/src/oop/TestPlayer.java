package oop;

class Player {
	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	public void print() {
        System.out.println(this.name);
	}
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
}


public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
