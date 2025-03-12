package Lesson36_hometask;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class second {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		Scanner number2 = new Scanner(System.in);
		Scanner number3 = new Scanner(System.in);
		Set<Integer> numbersSet =new HashSet<Integer>();
		numbersSet.add(number.nextInt());
		numbersSet.add(number2.nextInt());
		numbersSet.add(number3.nextInt());
		System.out.println(numbersSet);
	}
}
