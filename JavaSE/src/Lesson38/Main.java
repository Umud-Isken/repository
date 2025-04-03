package Lesson38;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
//key = intiger 
//		Map<Integer, String> students = new HashMap<Integer, String>();
//		students.put(1, "Umud");
//		students.put(2, "Elvin"); 
		
		Map<String, Integer>  students =new HashMap<String, Integer>();
		students.put("Umud", 14);
		students.put("Sabir", 12);
		System.out.println(students.get("Umud"));
		 
	}
}
