package lib1;

import java.util.Scanner;

public class PrintVertical {

	public static void main(String[] args) {
		var s = new Scanner(System.in);
		System.out.print("Enter string :");
		var st = s.nextLine();

		for (int i = 0; i < st.length(); i++)
			System.out.println(st.charAt(i));

	}

}
