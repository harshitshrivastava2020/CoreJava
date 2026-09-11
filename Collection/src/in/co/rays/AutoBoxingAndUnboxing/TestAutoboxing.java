package in.co.rays.AutoBoxingAndUnboxing;

public class TestAutoboxing {
	public static void main(String[] args) {
		int a = 16;
		// Integer b = new Integer(a); //old AutoBoxing
		Integer b = a; // new AutoBoxing
		int k = b; // UnBoxing
		System.out.println(a);
		System.out.println("autoboxing: " + b);

		System.out.println("---------------");

	}

}
