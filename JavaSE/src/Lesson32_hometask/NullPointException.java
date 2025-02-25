package Lesson32_hometask;

public class NullPointException {
	public static void main(String[] args) {
		try {
			String string = null;
			System.out.println(string.length());
		} catch (NullPointerException e) {
			System.out.println("string is null");
		}
	}
}
