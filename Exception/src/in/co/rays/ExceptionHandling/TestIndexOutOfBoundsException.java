package in.co.rays.ExceptionHandling;

public class TestIndexOutOfBoundsException {
	public static void main(String[] args) {
		String name = "Harshit";
		try {
			System.out.println(name.charAt(7));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("exception: " + e.getMessage());
		}

	}

}
