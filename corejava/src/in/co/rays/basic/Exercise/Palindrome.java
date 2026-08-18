package in.co.rays.basic;

public class Palindrome {
	public static void main(String[] args) {
		int num = 121;
		int num2 = num;
		int reverse = 0;
		

		while (num > 0) {
			int a = num % 10;
			reverse = reverse * 10 + a;
			num = num / 10;

		}

		if (num2 == reverse) {
			System.out.print("the number is a palindrome");

		} else {
			System.out.print("the number is not a palindrome");

		}

	}

}
