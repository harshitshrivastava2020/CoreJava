package in.co.rays.basic.StringMethods;

public class TestingStringHeapMemory {
	public static void main(String[] args) {
		String name = "Java";
		String name2 = "Java";
		
		System.out.print("use comparison operator :");
		System.out.println(name == name2);
		
		String name3 = new String("java");
		String name4 = new String("java");
		
		System.out.print("use new string() method :");
		System.out.println(name3 == name4);
		
		System.out.print("use dot equal method :");
		System.out.println(name.equals(name2));
		
		
		
		System.out.print("use dot equal method :");
		System.out.println(name3.equals(name4));
	}

}
