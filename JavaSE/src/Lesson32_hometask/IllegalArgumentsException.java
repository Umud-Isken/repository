package Lesson32_hometask;

public class IllegalArgumentsException {
	public static void main(String[] args) {

		try {
			String sayHello = "Hello";
			int hello = Integer.parseInt(sayHello);
		} catch (NumberFormatException e) {
			System.err.println("Состоит из 4 символов!");
		} finally {
			System.err.println("Введите не больше 4 символов и не больше 0");
		}

	}
}
