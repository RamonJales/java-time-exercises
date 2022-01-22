package application;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class Main {

	public static void main(String[] args) {
		//dateTimeFormatter class
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		/*
		EX.:
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		*/
				
		//formatting
		String formatted = formatter.format(LocalDateTime.now());
		
		//Printing
		System.out.println(formatted);
		
		//--------------------------------------------------------------------------------------------
		
		//Formatter pattern
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
		
		//printing
		System.out.println(formatter2.format(ZonedDateTime.now())); //Same thing
		System.out.println(ZonedDateTime.now().format(formatter2)); //Same thing
		
		//--------------------------------------------------------------------------------------------
		
		//Parse
		TemporalAccessor date = formatter2.parse("11/10/2013 - 15:34");
		//downCasting
		LocalDateTime parse = LocalDateTime.from(date);
		
		//printing
		System.out.println(parse);
	}

}
