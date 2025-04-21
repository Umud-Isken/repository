package Lesson42_hometask;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

import javax.security.auth.callback.LanguageCallback;

public class first {
	public static void main(String[] args) {
		Date date =new Date();
		System.out.println(date);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
//		localDate.plusDays(34);
//		localDate.plusWeeks(2);
//		localDate.plusMonths(2);
//		localDate.plusYears(1);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
//		localTime.plusHours(1);
//		localTime.plusMinutes(45);
//		localTime.plusNanos(2343214);
//		localTime.plusSeconds(12);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

	}
}
