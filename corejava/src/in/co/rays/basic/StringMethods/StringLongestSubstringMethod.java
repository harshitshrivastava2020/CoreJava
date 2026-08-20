package in.co.rays.basic.StringMethods;

public class StringLongestSubstringMethod {
	    public static void main(String[] args) {
	        String s = "ujlujl";

	        int maxLength = 0;
	        String longest = "";

	        for (int i = 0; i < s.length(); i++) {
	            String current = "";

	            for (int j = i; j < s.length(); j++) {
	                char ch = s.charAt(j);

	                if (current.indexOf(ch) != -1) {
	                    break;
	                }

	                current += ch;

	                if (current.length() > maxLength) {
	                    maxLength = current.length();
	                    longest = current;
	                }
	            }
	        }

	        System.out.println("Longest substring: " + longest);
	        System.out.println("Length: " + maxLength);
	    }
	}


