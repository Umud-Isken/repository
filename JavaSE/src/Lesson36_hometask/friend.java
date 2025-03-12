package Lesson36_hometask;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class friend {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		Scanner age =new Scanner(System.in);
		Scanner name2 =new Scanner(System.in);
		Scanner age2 =new Scanner(System.in);
		Set<String> friend =new HashSet<String>();
		System.out.println("Write name of You friend");
		friend.add(name.next());
		System.out.println("Write age of your friend");
		friend.add(age.next());
		System.out.println("White new name of friend");
		friend.add(name2.next());
		System.out.println("Write age new friend");
		friend.add(age2.next());
		System.out.println(friend);
	}
}
