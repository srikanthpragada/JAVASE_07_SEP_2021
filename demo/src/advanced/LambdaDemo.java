package advanced;

class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread1 using Runnable");
	}
}

public class LambdaDemo {
	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		var t1 = new Thread(new Task());
		t1.start();

		// Using anonymous inner class
		var t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread2 using Anonymous inner class!");
			}
		});
		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Thread with Lambda!"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();
		
		// Method reference
		Thread t5 = new Thread(LambdaDemo::printNumbers);
	    t5.start();
		

	}

}
