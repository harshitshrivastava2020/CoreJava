package in.co.rays.basic.StringMethods;

public class FindingVowels {
	public static void main(String[] args) {
		String str = "harshit";

		for (int i = 0; i < str.length(); i++) {
			char j = str.charAt(i);
			switch (j) {
			case 'a':
				System.out.println(j);
				break;

			case 'e':
				System.out.println(j);
				break;

			case 'i':
				System.out.println(j);
				break;

			case 'o':
				System.out.println(j);
				break;

			case 'u':
				System.out.println(j);
				break;
			}
		}
	}
}
