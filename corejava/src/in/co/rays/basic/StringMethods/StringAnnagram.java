package in.co.rays.basic.StringMethods;

public class StringAnnagram {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		String str = "";
		String str2 = "";

		for (char ab = 'a'; ab <= 'z'; ab++) {
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
				if (c == ab) {
					str = str + ab;
				}
			}
		}
		System.out.println(str);

		for (char cd = 'a'; cd <= 'z'; cd++) {
			for (int j = 0; j < s2.length(); j++) {
				char d = s2.charAt(j);
				if (d == cd) {
					str2 = str2 + cd;
				}
			}
		}
		System.out.println(str2);

		if (str.equals(str2)) {
			System.out.println("It's Annagram");
		} else {
			System.out.println("It is not Annagram");
		}

	}

}
