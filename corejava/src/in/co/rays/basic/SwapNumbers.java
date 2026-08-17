package in.co.rays.basic;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 20;
		int b = 5;

		System.out.println("a =" + a);
		System.out.println("b =" + b);

		a = a + b;
		b = a - b;
//		System.out.println("a2 =" + a);
//		System.out.println("b2 =" + b);
		a = a - b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);


	}

}
