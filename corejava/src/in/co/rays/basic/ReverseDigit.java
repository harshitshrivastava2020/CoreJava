package in.co.rays.basic;

public class ReverseDigit {
	public static void main(String[] args){
		int i = 123;
		int reverse = 0;
		
		while (i != 0) {
			int digit = i % 10;      
			reverse = reverse * 10 + digit; 
			i = i / 10;               
		}
		
		System.out.println("Reversed Number: " + reverse);	
	}
}
