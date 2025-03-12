package Lesson36_hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Array23 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		Scanner type = new Scanner(System.in);
		Scanner location = new Scanner(System.in);
		List<String> plant =new ArrayList<String>();
		System.out.println("Name of plant");
		plant.add(name.next());
		System.out.println("type of plant");
		plant.add(type.next());
		System.out.println("loaction of plant");
		plant.add(location.next());
		System.out.println(plant);
	}
}
