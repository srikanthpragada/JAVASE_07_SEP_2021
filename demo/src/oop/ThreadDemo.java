package oop;

class ChildThread extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Child -> " + i);
		}
	}
} 

public class ThreadDemo {

	public static void main(String[] args) {
		var t = Thread.currentThread();
		System.out.println(t);
		
		var ct = new ChildThread();
		ct.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println("Main -> " + i);
		}

	}

}
