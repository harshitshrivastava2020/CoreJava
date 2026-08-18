package in.co.rays.basic.StringMethods;

public class StringMethods {
	public static void main(String[] args) {
		String name = "Harshit Shrivastava";
		System.out.println("String Length - " +name.length());
		System.out.println("7 Character is - " +name.charAt(6));
		System.out.println("Shri index is - " +name.indexOf("Shri"));
		System.out.println("first 'r' position - " +name.indexOf("r"));
		System.out.println("last 'r' position - " +name.lastIndexOf("r"));
		System.out.println(" 'a' is replaced by '_' - " +name.replace("a","_"));
		System.out.println(" Lowercase - " +name.toLowerCase());
		System.out.println(" Uppercase - " +name.toUpperCase());
		System.out.println(" starts with 'Harshit' - " +name.startsWith("Harshit"));
		System.out.println(" ends with 'tava' - " +name.endsWith("tava"));
		System.out.println(" Substring from index 6 - " +name.substring(6));


	}

}
