package Lesson30_hometaxk;

public class Main {
	public static void main(String[] args) {
		Adder adder = new Adder();
		Printer printer = new Printer();

		int result = adder.add(5, 7);
		printer.print(result);
	}
}
