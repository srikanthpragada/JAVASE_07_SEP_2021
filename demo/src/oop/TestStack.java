package oop;

class Stack {
	private int[] data = new int[10];
	private int top = 0;

	public void push(int value) {
		this.data[this.top] = value;
		this.top++;
	}

	public int pop() {
		if (this.top > 0) {
			this.top--;
			return this.data[this.top];
		} else
			throw new RuntimeException("Stack empty!");
	}

	public int peek() {
		if (this.top > 0)
			return this.data[this.top - 1];
		else
			throw new RuntimeException("Stack empty!");
	}

	public int length() {
		return this.top;
	}

	public boolean isEmpty() {
		return this.top == 0;
	}
}

public class TestStack {

	public static void main(String[] args) {
		var s = new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s.length());
		System.out.println(s.pop());
		System.out.println(s.length());
	}

}
