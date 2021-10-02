package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		var s = new Scanner(System.in);
		var sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter a number :");
			try {
				int n = s.nextInt();
				sum += n;
			} catch (InputMismatchException ex) {
                System.out.println("Sorry! Invalid number!");
                s.nextLine(); // clear buffer 
			}
		}

		System.out.println(sum);

	}

}
