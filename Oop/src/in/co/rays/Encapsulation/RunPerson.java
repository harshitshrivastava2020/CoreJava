package in.co.rays.Encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RunPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Person p = new Person();

		p.setName("Harshit");
		p.setDob(sdf.parse("25-08-2005"));
		p.setAddress("indore");
		

		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(p.getAddress());
		System.out.println(p.getAge(p.getDob()));

	}

}
