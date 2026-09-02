package in.co.rays.ExceptionHandling;

public class TryCatchWithFinallyBlock {

public static void main(String[] args) {
	String name = "Harshit";

	try {
		System.out.println(name.length());
		System.out.println(name.charAt(7));
	} catch (Exception e) {
		System.out.println("exception 1: " + e.getMessage());
	}finally {
		System.out.println("always execute");

	}

}
}
