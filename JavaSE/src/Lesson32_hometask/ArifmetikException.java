package Lesson32_hometask;

public class ArifmetikException {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int numResult = num1 / 0;
		} catch (ArithmeticException e) {
			System.out.println("На 0 делать нельзя");
		}
	}
}
