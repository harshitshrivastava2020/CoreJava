package in.co.rays.Overriding.java;

public class ICICIBank extends Bank {
	@Override
	public String getName() {
		return "ICICBank";
	}
	public double interestRate() {
		return 12.10;
	}

}
