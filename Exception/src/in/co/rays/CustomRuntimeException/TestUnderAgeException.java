package in.co.rays.CustomRuntimeException;

public class TestUnderAgeException {
	public static void main(String[] args) {
		int personAge = 16;
		if (personAge >= 18) {
			System.out.println("person has over age");
		} else {
			try {
				throw new UnderAgeException();
			} catch (UnderAgeException e) {
				System.out.println("Custom under age Exception" + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
