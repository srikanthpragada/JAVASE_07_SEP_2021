package oop;

interface BankAccount {
    int MINBAL = 5000;
	void deposit(double amount);

	void withdraw(double amount);

	double getBalance();
}

class CurrentAccount implements BankAccount {

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class TestInterface {

	public static void main(String[] args) {
		BankAccount a = new CurrentAccount();
		a.deposit(1000);
		System.out.println(a.getBalance());

	}

}
