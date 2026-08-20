package in.co.rays.basic.StringMethods;

public class StringExercise {
	public static void main(String[] args) {

		String firstName = "Vijay";
		String lastName = "Chauhan";

		System.out.println(firstName + " " + lastName);

		String str = "Vijay Chauhan";
		lastName = str.substring(str.lastIndexOf(" ") + 1);
		System.out.println(lastName);

	}
}
