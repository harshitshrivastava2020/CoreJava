package in.co.rays.basic.StringMethods;

public class StringCountDigit {
	public static void main(String[] args) {

		String str = "harshit45464562l9oooo";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			System.out.println(Character.isDigit(str.charAt(i)));
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		
		System.out.println("total digits in string: " + count);

	}

}
