package oop;

public class NestedMethods {

	public static void main(String[] args) {
		class LocalClass {
			public void print() {

			}
		}
		
		var obj = new LocalClass();
		obj.print(); 
		
		// Anonymous class 
		var r = new Runnable() {
			public void run()
			{
				
			}
		};
		
		r.run(); 
		
	}

}
