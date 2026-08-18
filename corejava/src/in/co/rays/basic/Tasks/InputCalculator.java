package in.co.rays.basic.Tasks;

import java.util.Scanner;

public class InputCalculator {
	public static void main(String[] args) {
		
		
		
	 Scanner sc = new Scanner(System.in);
		System.out.print("enter first value :");
		int a = sc.nextInt();

		
		System.out.print("enter second value :");
		int b = sc.nextInt();
		
		System.out.println("your first num is: " + a);
		System.out.println("your second num is: " + b);
		
		System.out.print("kindly enter the operators b/w  (+,-,*,/) :");
		String opr = sc.next();
		
		switch (opr) {
		case "+":
			System.out.println("Addion of a+b" + " " + (a + b));
			break;
		case "-":
			System.out.println("substraction of a-b" + " " + (a - b));
			break;
		case "*":
			System.out.println("Multiplication of a*b" + " " + (a * b));
			break;
		case "/":
			System.out.println("Divisible of a/b" + " " + (a / b));
			break;
		default:
			System.out.println("Multiplication of a*b" + " ");
			break;
		}
		
	}

}
