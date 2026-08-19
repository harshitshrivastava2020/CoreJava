package in.co.rays.basic.StringMethods;

public class StringPalindrome {
	public static void main(String[] args) {

		String str = "nitin";
		String str2 = str;
		String reverse = "";
		
		int i =str.length()-1;

		while (i >= 0) {
//			System.out.println("hhhhhh"+i);
			reverse = reverse +str.charAt(i);
			i--;
		}
		if (str2.equals(reverse)) {
			System.out.print("the string is a palindrome");

		} else {
			System.out.print("the string is not a palindrome");

		}

	}
}
