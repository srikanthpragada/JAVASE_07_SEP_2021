package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[10];

//		for (int i = 0; i < a.length; i++)
//			System.out.printf("%d ",a[i]);
		
		for (int v : a)
			System.out.printf("%d ",v);

	}

}
