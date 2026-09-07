package in.co.rays.ExceptionHandling;

public class UncheckedException {
	public static void main(String[] args) {
		try {
			dad();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void dad() {
		mom();
	}

	private static void mom() {
		son();
	}

	private static void son() {
		throw new RuntimeException("made a mistake");
	}
}
