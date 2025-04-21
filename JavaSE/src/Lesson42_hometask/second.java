package Lesson42_hometask;

import java.time.LocalDate;

public class second {
	public static void main(String[] args) {
		LocalDate localDate =  LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.plusDays(7));
	}
}
