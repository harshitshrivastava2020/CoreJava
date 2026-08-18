package in.co.rays.basic;

public class SwitchCase {
	public static void main(String[] args) {
		String studentMarks = "80%";
		switch (studentMarks) {
		case "20%":
			System.out.println("ankit got 80% marks");
			break;

		case "40%":
			System.out.println("vivek got 80% marks");
			break;

		case "50%":
			System.out.println("rohit got 80% marks");
			break;

		case "60%":
			System.out.println("rahul got 80% marks");
			break;

		case "75%":
			System.out.println("chinmaye got 80% marks");
			break;

		case "80%":
			System.out.println("harshit got 80% marks");
			break;
		default:
			System.out.println("No one can get 80% marks");
			break;

		}
	}

}
