package lib1;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinStrings {

	public static void main(String[] args) {
		var s = new Scanner(System.in);
		var sj = new StringJoiner("-");

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter string :");
			var st = s.nextLine();
			sj.add(st);
		}

		System.out.println(sj);

	}

}
