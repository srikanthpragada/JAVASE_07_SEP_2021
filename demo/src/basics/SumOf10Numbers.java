package basics;

import java.util.Scanner;

public class SumOf10Numbers {

	public static void main(String[] args) {
		 int total = 0;
		 
		 var s = new Scanner(System.in);
		 
		 for( var i = 0; i < 5; i ++)
		 {
			 System.out.print("Enter number :");
			 total += s.nextInt();
		 }
		 
		
	     System.out.println(total);
	}

}
