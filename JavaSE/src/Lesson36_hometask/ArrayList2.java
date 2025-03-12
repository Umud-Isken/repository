package Lesson36_hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);

		Scanner size = new Scanner(System.in);

		Scanner color = new Scanner(System.in);

		Scanner price = new Scanner(System.in);
		List<String> produc = new ArrayList<String>();

		System.out.println("Name of product");

		produc.add(name.next());
		System.out.println("Size of product");
		produc.add(size.next());

		System.out.println("Color of product");
		produc.add(color.next());
		System.out.println("Price of product");
		produc.add(price.next());
		System.out.println(produc);
	}
}
