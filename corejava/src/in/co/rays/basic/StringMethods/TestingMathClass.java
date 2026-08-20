package in.co.rays.basic.StringMethods;

public class TestingMathClass {
	public static void main(String[] args) {
		System.out.println("Mathemaics Functions");

		System.out.println("Max 2,5 - " + Math.max(2, 5));
		System.out.println("Min 2,5 - " + Math.min(2, 5));

		System.out.println("Absolute 3.7 - " + Math.abs(3.7));

		System.out.println("Exp 10 - " + Math.exp(10));
        
		double RandomNumber = Math.random()*100;
		
		for(;RandomNumber <=100;RandomNumber++) {
			System.out.println("Random Number - " +RandomNumber);
		}
		
		System.out.println("Square Root -"+Math.sqrt(4));

	}
}
