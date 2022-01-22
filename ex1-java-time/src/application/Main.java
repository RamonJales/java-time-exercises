package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		
		//LocalDate - represents a date: 06/05/2001
		
		//get current date
		LocalDate ld = LocalDate.now();
		
		// Put your own date
		LocalDate ld1 = LocalDate.of(2003, 05, 9);
		LocalDate ld2 = LocalDate.of(1990, Month.JULY, 06);
		
		System.out.println("Current date: " + ld);
		System.out.println("- " + ld1);
		System.out.println("- " + ld2);
		
		System.out.println();
		
		//LocalTime - represents a time: 13:45:55
		
		LocalTime lt = LocalTime.now();
		LocalTime lt1 = LocalTime.of(13, 36);
		
		System.out.println("Current time: " + lt);
		System.out.println("- " + lt1);
		
		System.out.println();

		//LocalDateTime - represents a date and time: 06/05/2001 13:45:55
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime ldt1 = LocalDateTime.of(ld1, lt1);
		
		System.out.println("Current date and time: " + ldt);
		System.out.println("- " + ldt1);
		
		System.out.println();

		//Instant - represents an instant on the timeline since the year 1970(milliseconds) in GMT/UTC: 06/05/2001 16:45:55
		
		Instant inst = Instant.now();
		Instant inst1 = Instant.ofEpochMilli(646346876873L);
		
		System.out.println("Instant: " + inst);
		System.out.println("- " + inst1);
		
		System.out.println();

		//ZoneDateTime - represents zone time: 06/05/2001 13:45:55 GMT-3 (América/São_Paulo)
		
		ZonedDateTime zdt = ZonedDateTime.now();
		ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, ZoneId.of("America/Montevideo"));
		
		System.out.println("Zone date and time : " + zdt);
		System.out.println("- " + zdt1);
		
	}

}
