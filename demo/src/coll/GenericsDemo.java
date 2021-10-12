package coll;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
//		var al1 = new ArrayList();
//		al1.add("Abc");
//		al1.add(10);  // Boxing - 10 to Integer 
//		
//		String st = (String) al1.get(1);

		ArrayList<String> names = new ArrayList<>();
		var nums = new ArrayList<Integer>();

		names.add("Abc");
	    nums.add(10);  // boxing

		String s = names.get(0);
		int v = nums.get(0);   // Unboxing - Integer to int

	}

}
