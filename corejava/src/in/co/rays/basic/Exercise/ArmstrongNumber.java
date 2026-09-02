package in.co.rays.basic.Exercise;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;

		int a = number % 10;
		int b = (number / 10) % 10;
		int c = number / 100;

		int addition = a * a * a + b * b * b + c * c * c;

		if (addition == number) {
			System.out.println("number is a armstrong number");
		} else {
			System.out.println("number is not a armstrong number");
		}
	}

}
