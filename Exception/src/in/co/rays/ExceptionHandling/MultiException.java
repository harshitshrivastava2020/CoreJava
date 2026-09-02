package in.co.rays.ExceptionHandling;

public class MultiException {
	public static void main(String[] args) {
		String name = "Harshit";

		try {
			System.out.println(name.length());
			System.out.println(name.charAt(7));
		} catch (NullPointerException e) {
			System.out.println("exception 1: " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("exception 2: " + e.getMessage());
		}
		

	}

}
