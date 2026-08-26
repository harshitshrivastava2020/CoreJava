package in.co.rays.basic.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateJavaTimeApiMethods {
	public static void main(String[] args) {
		//Local Date and time methods
		// number 1 now 
		LocalDate today = LocalDate.now();
		LocalDateTime td = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				
		String formattedDate = today.format(format);
		
		System.out.println(today);
		System.out.println(td);
		System.out.println("Curret Date and Time : "+ formattedDate);
		
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		System.out.println(today.getDayOfWeek());
		System.out.println("get era "+today.getEra());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getChronology());
		System.out.println(today.getMonth());
		
		
		
		// number 2 off

		LocalDate today2 = LocalDate.of(2001,11,28);
		System.out.println(today2);


	}

}
