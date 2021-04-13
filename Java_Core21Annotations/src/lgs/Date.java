package lgs;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;

public class Date {
	
	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate today is --->" + ld);
		System.out.println("It will be in 396 days  --->" + ld.plusDays(396));
		System.out.println("It was 7 years and 7 days ago _--->" + ld.minusYears(7).minusDays(7));
		System.out.println(ld.isLeapYear());
		System.out.println();
		
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime now is --->" +lt);
		System.out.println(lt.atDate(ld));
		LocalTime elt = LocalTime.of(10, 8);
		System.out.println( lt.getHour() - elt.getHour());
		System.out.println(lt.minusHours(2));
		System.out.println();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime --->" +ldt);
		System.out.println(ldt.toLocalTime());
		LocalTime lt2 = lt.NOON;
		System.out.println(lt2.plusHours(3).equals(ldt));
		
		SimpleDateFormat format = new SimpleDateFormat();
		System.out.println(format.WEEK_OF_YEAR_FIELD );
	}
	
	
	
}
