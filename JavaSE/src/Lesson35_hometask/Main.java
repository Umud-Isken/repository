package Lesson35_hometask;

public class Main {
	public static void main(String[] args) {
		Generic<Integer, String, Double> triple = new Generic<>(1, "Hello", 3.14);
		triple.printTriple();

		triple.setFirst(2);
		triple.setSecond("World");
		triple.setThird(2.71);
		triple.printTriple();
	}
}
