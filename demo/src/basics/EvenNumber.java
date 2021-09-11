// Take a number and display whether it is even or odd 

package basics;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  // Scanner is associated with keyboard 
        System.out.print("Enter a number :");
        int num = s.nextInt();    // read an int using Scanner 
        
        if (num % 2 == 0)
        	System.out.println("Even");
        else
        	System.out.println("Odd");
	}
}
