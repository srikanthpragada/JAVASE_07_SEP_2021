package advanced;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		 var names = new ArrayList<String>();
		 
		 names.add("Java");
		 names.add("C");
		 names.add("TypeScript");
		 names.add("Python");
		 names.add("Ruby");
		 
		 Collections.sort(names);
		 Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
		 
		 for(var n : names)
			 System.out.println(n);
	}
}
