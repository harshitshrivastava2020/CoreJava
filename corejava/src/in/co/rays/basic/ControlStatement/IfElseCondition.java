package in.co.rays.basic.ControlStatement;

public class IfElseCondition {
	public static void main(String[] args) {
		int a = 80;
		int b = 60;

		int sum = a + b;
		if (sum > 100) {
			if (sum < 200) {
				if (sum % 7 == 0) { 
					System.out.println("it works");
				}
			}
		}
	}

}
