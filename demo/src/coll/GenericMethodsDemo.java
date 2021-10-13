package coll;

public class GenericMethodsDemo {

	public static <T> void process(T[] v) {
		for (T n : v)
			System.out.println(n);
	}

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3 };
		String[] s = { "Abc", "Xyz" };

		process(a);
		process(s);

	}

}
