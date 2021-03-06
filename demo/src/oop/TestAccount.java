package oop;

class SavingsAccount {
	private int acno;
	private String customer;
	private double balance;

	public SavingsAccount(int acno, String customer) {
		this.acno = acno;
		this.customer = customer;
		this.balance = 0;
	}

	public SavingsAccount(int acno, String customer, double balance) {
		this(acno,customer);  // call another constructor 
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}
}

public class TestAccount {
	public static void main(String[] args) {
		var a1 = new SavingsAccount(1, "Abc");
		a1.deposit(10000);
		System.out.println(a1.getBalance());
		a1.withdraw(5000);
		var a2 = new SavingsAccount(2, "Xyz", 10000);
		a2.deposit(20000);

	}

}
