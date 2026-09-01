package in.co.rays.Overriding.java;

public class RunBank {
	public static void main(String[] args) {
		Bank b1 = new AxisBank();

		System.out.println("Bank name" + b1.getName());
		System.out.println("InterestRate" + b1.interestRate());

		System.out.println("-------------");

		Bank b2 = new HDFCBank();

		System.out.println("Bank name" + b2.getName());
		System.out.println("InterestRate" + b2.interestRate());
		System.out.println("----------");

		Bank b3 = new ICICIBank();

		System.out.println("Bank name" + b3.getName());
		System.out.println("InterestRate" + b3.interestRate());
	}

}
