package Lesson38_hometask;

import java.util.HashMap;
import java.util.Map;

public class Integer_to_String {
	public static void main(String[] args) {
		Map<Integer, String> number = new HashMap<Integer, String>();
		number.put(1, "One");
		number.put(2, "Two");
		number.put(3, "Three");
		number.put(4, "Four");
		number.put(5, "Five");
		number.forEach((key, value) -> {
			System.out.println("Number " + key + " —> " + value);
		});
	}
}
