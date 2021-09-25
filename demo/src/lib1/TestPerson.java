package lib1;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public boolean equals(Object obj) {
		var other = (Person) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}

	@Override 
	public int hashCode() {
		return this.age;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		var p1 = new Person("A", 20);
		System.out.println(p1.hashCode());
		var p2 = new Person("A", 20);
		System.out.println(p2.hashCode());

		System.out.println(p1.toString());
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}

}
