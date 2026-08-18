package in.co.rays.basic;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int num = 2; num <= 100; num++) {
			int i;

			for (i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					break;
				}
			}

			if (i > num / 2) {
				System.out.println("number is a prime number: " + num);
			}
		}
	}
}
