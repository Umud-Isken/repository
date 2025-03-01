package Lesson33_hometask;

public class Multicatch {
	public static void main(String[] args) {
		try {
			int num = 10 / 0;
			int[] num1 = { 2, 4, 5 };
			System.out.println(num1[3]);
			String string = null;
			System.out.println(string.length());
		} catch (ArithmeticException e) {
			System.out.println("На 0 делить нельзя");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Нельзя выходить за границу массива");
		} catch (NullPointerException e) {
			System.out.println("String is null");
		}
	}
}
