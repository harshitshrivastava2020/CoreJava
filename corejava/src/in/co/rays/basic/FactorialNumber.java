package in.co.rays.basic;

public class FactorialNumber {
	public static void main(String[] args) {
		int factorial= 1;
		int number = 9;
		
		for (int i = number;i>0;i--) {
			factorial = factorial *i;
		}
			System.out.println(factorial);
	}

}
