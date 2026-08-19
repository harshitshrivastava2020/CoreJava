package in.co.rays.basic.StringMethods;

public class StringFindingChar {
	public static void main(String[] args) {
		String name = "Google";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'o') {
				count++;
			}
		}
		System.out.println("count for finding 'O' in string :" + count);
	}

}
