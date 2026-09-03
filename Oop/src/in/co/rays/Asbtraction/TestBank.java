package in.co.rays.Asbtraction;

public class TestBank {
	public static void main(String[] args) {
		Bank b = new AxisBank();
		System.out.println("bank name: " + b.getName());
		System.out.println("bank interest rate: " + b.interestRate());

		System.out.println("=====================================================");

		Bank b1 = new HDFCBank();
		System.out.println("bank name: " + b1.getName());
		System.out.println("bank interest rate: " + b1.interestRate());

		System.out.println("=====================================================");

		Bank b2 = new ICICIBank();
		System.out.println("bank name: " + b2.getName());
		System.out.println("bank interest rate: " + b2.interestRate());

	}
}
