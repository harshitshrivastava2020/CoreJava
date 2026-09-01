package in.co.rays.Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RunPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("------------------ BusinessMan --------------------------");
		BusinessMan bm = new BusinessMan();
		bm.setName("Harshit");
		bm.setAddress("Indore");
		bm.setDate(sdf.parse("26-12-1999"));
		bm.setIncome(90000.00);
		
		System.out.println(bm.getName());
		System.out.println(bm.getAddress());
		System.out.println(bm.getDate());
		System.out.println(bm.getIncome());
		
		System.out.println("------------------ Doctor --------------------------");
		
		Doctor dc = new Doctor();
		dc.setName("Chinmaye");
		dc.setAddress("Bhopal");
		dc.setDate(sdf.parse("22-05-2001"));
		dc.setRegistrationNo("666");
		
		System.out.println(dc.getName());
		System.out.println(dc.getAddress());
		System.out.println(dc.getDate());
		System.out.println(dc.getRegistrationNo());
		
		System.out.println("------------------ Student --------------------------");
		
		Student std=new Student();
		std.setName("Abhishek");
		std.setAddress("Gwalior");
		std.setDate(sdf.parse("05-10-2003"));
		std.setRollNo("21");
		std.setMarks(70);
		
		System.out.println(std.getName());
		System.out.println(std.getAddress());
		System.out.println(std.getDate());
		System.out.println(std.getRollno());
		System.out.println(std.getMarks());

		
		
		


		
		


	}

}
