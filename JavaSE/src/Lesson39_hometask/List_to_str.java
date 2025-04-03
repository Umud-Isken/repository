package Lesson39_hometask;

import java.util.ArrayList;
import java.util.List;

public class List_to_str {
	public static void main(String[] args) {
		System.out.println("List to String");
		System.out.println("");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Umud");
		list1.add("Nurkhan");
		list1.add("Sabir");
		String[] namesArray = list1.toArray(new String[0]);
		for (String s : namesArray) {
			System.out.println(s);
		}
	}
}
