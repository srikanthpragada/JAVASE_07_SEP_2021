package threads;

class PrimeThread extends Thread {
	private int n;
	public PrimeThread(int n) {
		this.n = n;
	}
	public void run() {
		for (int i = 2; i <= this.n / 2; i++) {
			if (this.n % i == 0) {
				System.out.printf("\n%d is not prime", n);
				return;
			}
		}
		System.out.printf("\n%d is prime", n);
	}
}

public class TestPrimeThread {

	public static void main(String[] args) {

		int a[] = { 57, 3457, 3737473, 28222, 38381 };

		for (int n : a) {
			var t = new PrimeThread(n);
			t.start();
		}

	}

}
