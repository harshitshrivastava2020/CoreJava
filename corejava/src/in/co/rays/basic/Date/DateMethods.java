package in.co.rays.basic.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMethods {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		
		//methods of date
		
		// date to string:
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("h:mm a");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa");

		String str = sdf.format(d);
		String str2 = sdf2.format(d);
		String str3 = sdf3.format(d);
		
//		System.out.println(str.getClass().getSimpleName());
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		
		
		//string to date
		
	   String s ="25/08/2026";
	   Date d1 = sdf.parse(s);
	   System.out.println(d1);
	   
//		System.out.println(d1.getClass().getSimpleName());


	}

}
