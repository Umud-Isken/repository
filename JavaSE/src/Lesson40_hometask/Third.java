package Lesson40_hometask;

import java.util.List;
import java.util.function.Consumer;

public class Third {
	public static void main(String[] args) {
		List<String> strings = List.of("hello", "world", "java", "programming");
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		strings.forEach(printUpperCase);
	}
}
