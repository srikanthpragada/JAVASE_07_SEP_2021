package basics;

public class FunsDemo {

	static void print(String name) {
		System.out.println("Hello " + name);
	}
	
	// Variable number of arguments 
	static void printAll(String ... names ) {
		 for(var n : names)
			 System.out.println("Hello " + n);
	}

	public static void main(String[] args) {
		print("James");
		printAll("Scott","Larry","Mark");
		printAll("Bill","Steve");
	}

}
