package Lesson25_hometask;

public class Main {
	public static void main(String[] args) {

		System.out.println("#1");
		Person person1 = new Person();
		person1.displayInfo();

		System.out.println("#2");
		Person person2 = new Person("Umud");
		person2.displayInfo();

		System.out.println("#3");
		Person person3 = new Person("Umud", 14);
		person3.displayInfo();
	}
}
