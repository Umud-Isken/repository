package Lesson36;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(12);
		// удаляет число по его индекусу
//		numbers.remove(1);
		//Изменяет число
//		numbers.set(0, 25);
		List<String> str = new ArrayList<String>();
		str.add("Hello");
		str.add("Good-bye");
		for (String i : str) {
			System.out.println(i);
		}
		//size - показывает индекс
//		System.out.println(str);
		System.out.println(numbers);
	}
}
