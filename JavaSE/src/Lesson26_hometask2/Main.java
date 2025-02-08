package Lesson26_hometask2;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Alice", 30, "New York");
		Person person2 = new Person("Bob", 25, "Chicago");

		System.out.println(person1.toString());
		System.out.println(person2.toString());

		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person1));
	}

}
