package in.co.rays.Constructor;

public class SuperConstructorRunShape {
	public static void main(String[] args) {
		System.out.println("---------------------- circle --------------------------");
		SuperConstructorCircle c = new SuperConstructorCircle("red", 48, 2);
		System.out.println("---------------------- rectangle --------------------------");

		SuperConstructorRectangle r = new SuperConstructorRectangle("red", 48, 5, 5);

	}

}
