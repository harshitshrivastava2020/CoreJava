package in.co.rays.Overriding.java;

public class AxisBank extends Bank {
	@Override
	public String getName() {
		return "AxisBank";
	}

	public double interestRate() {
		return 11.25;
	}

}
