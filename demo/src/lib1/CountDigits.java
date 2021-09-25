package lib1;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		var s = new Scanner(System.in);
		System.out.print("Enter string :");
		var st = s.nextLine();
		int count = 0;

		for (int i = 0; i < st.length(); i++) {
			var ch = st.charAt(i);
			if (ch >= 48 && ch <= 57) // ch >= '0' && ch <= '9'
				count++;
		}

		System.out.println(count);

	}

}
