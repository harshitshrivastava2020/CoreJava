package in.co.rays.Overriding.java;

public class HDFCBank extends Bank {
	@Override
	public String getName() {
		return "HDFCBank";
	}
	public double interestRate() {
		return 10.10;
	}

}
