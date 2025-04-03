package Lesson39;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_to_Massivg {
	public static void main(String[] args) {
		// List to String
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
		
		System.out.println("");
		
		//String to List 
		System.out.println("String to List");
		System.out.println("");
		
		String[] strNames = {"Umud", "Nurkhan","Sabir"};
		List<String> namList =new ArrayList<>(Arrays.asList(strNames));
		namList.add("Emil");
		for (String a: namList) {
			System.out.println(a);
		}
		
		System.out.println("");
		
		//List Foreach
		System.out.println("List in foreach");
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(34);
		list.forEach(a->System.out.println(a));
		
		
		 List<Integer> numbers = Arrays.asList(10, 3, 5, 8, 12, 7);
		 for (Integer integer : numbers) {
			if (integer%2==0) {
				System.out.println(integer);
			}
		}

	}
}
