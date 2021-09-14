package basics;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		 int a[] = new int[5];
		 
		 var s = new Scanner(System.in);
		 
		 for( var i = 0; i < 5; i ++)
		 {
			 System.out.print("Enter number :");
			 a[i] = s.nextInt();
		 }
		 
		 // Print array in reverse
		 for( var i = a.length - 1;  i >= 0; i --)
			 System.out.println(a[i]);
		 
		 

	}

}
