package in.co.rays.basic.StringMethods;

public class StringBufferTest {
	public static void main(String[] args) {
		
	StringBuffer str = new StringBuffer("harshit ");
	
	str.append("Shrivastava");
	System.out.println(str);
	
	
	StringBuilder str2 = new StringBuilder("Hello ");
	str2.append("world");
	
	System.out.println(str2);
	
	StringBuffer i = new StringBuffer("harshit");
	str.append("Shrivastava");

	System.out.println("length :" + i.length());
	System.out.println("capacity :" + i.capacity());
	System.out.println("Char at :" + i.charAt(1));
	System.out.println("index Of :" + i.indexOf("harshit"));
	System.out.println("Replace :" + i.replace(0,5,"harry"));
	System.out.println("Reverse :" + i.reverse());

	
	
}

}
	