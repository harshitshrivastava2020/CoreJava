package in.co.rays.ExceptionHandling;

public class TestNullPointerException {
	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("exception: " + e.getMessage());
		}
	}

}
