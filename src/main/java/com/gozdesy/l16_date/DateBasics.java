package main.java.com.gozdesy.l16_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateBasics {
	
	public static String findDay(int month, int day, int year) {
		return LocalDate.of(year, month, day).getDayOfWeek().name(); //Verilen tarihe ait gün ismini getiriyor
    }

	public static void main(String[] args) {
		
		System.out.println("Local Time: "+ LocalTime.now());  //Güncel saat bilgisini getiriyor
		System.out.println("Local Date: " + LocalDate.now()); //Güncel tarih bilgisini getiriyor
		System.out.println("Local Date and Local Time: " +LocalDateTime.now()); 
		
		System.out.println("Local Date and Local Time with local zone: " + ZonedDateTime.now());
		
		System.out.println("Offset Time: " + OffsetTime.now());
		System.out.println("Offset Date Time: " + OffsetDateTime.now());
		
		System.out.println("Month and Day: " + MonthDay.now());
		System.out.println("Year and Month: " + YearMonth.now());
		System.out.println("Instant Time: " + Instant.now());
		
		LocalDate ID = LocalDate.of(2022, 12, 19);
		System.out.println();
		ID = LocalDate.parse("2022-11-20");
		System.out.println(ID);
		
		LocalDateTime IDT = LocalDateTime.parse("2022-05-26T10:28");
		System.out.println(IDT);
		
		//Date calculation methods
		ID = LocalDate.now();
		System.out.println("Yesterday was the: " + ID.minusDays(1));
		System.out.println("Today is the: " + ID);
		System.out.println("Tomorrow is the: " + ID.plusDays(1));
		System.out.println("Next week is the: " + ID.plusWeeks(1));
		System.out.println("Next month is the: " + ID.plusMonths(1));
		System.out.println("Next year is the: " + ID.plusYears(1));
		
		//Date formatting
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM YYYY");
		System.out.println(ID.format(formatter));

	}

}
