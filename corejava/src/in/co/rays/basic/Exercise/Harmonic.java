package in.co.rays.basic;

public class Harmonic {
	 public static void main(String args[]) {

	        double sum = 0;

	        for (int i = 1; i <= 10; i++) {

	            double a = 1.0 / i;   // 1/i ka actual value
	            sum = sum + a;       // sum me add karna

	            System.out.println("Term: 1/" + i + " = " + a);
	        }

	        System.out.println("Harmonic Series Sum = " + sum);
	    }
}
