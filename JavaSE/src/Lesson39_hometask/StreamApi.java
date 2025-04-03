package Lesson39_hometask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		//обычная форма
//		 List<Integer> numbers = Arrays.asList(10, 3, 5, 8, 12, 7);
//		 for (Integer integer : numbers) {
//			if (integer%2==0) {
//				System.out.println(integer);
//			}
//		}
		
		//Stream API
		List<Integer> numbers = Arrays.asList(10, 3, 5, 8, 12, 7);
		List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<Integer> number=numbers.stream().filter(a->a%2==1).collect(Collectors.toList());
		System.out.println(number);
	}
}
