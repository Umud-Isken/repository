package Lesson40_hometask;

import java.util.function.Predicate;

public class SecondTask {
	public static void main(String[] args) {
		Predicate<Integer> numbers = a -> a%2 ==0;
		System.out.println(numbers.test(12));
	}
}
