package in.co.rays.Overriding.java;

public class SavingAccount extends BankAccount {

	private double interestRate;
	private double minBalance;

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public double calculateInterest() {
		return getBalance() * interestRate/100;
	}

	public void addInterest() {
		double interest = calculateInterest();
		super.deposit(interest);
		System.out.println("Interest added: " + interest);

	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			super.deposit(amount);
			System.out.print("Savings");
		} else {
			System.out.println("Savings Account Error: Invalid deposit amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
			if (getBalance() - amount >= minBalance) {
				System.out.println("Savings Account: Withdrawal successful.");
				System.out.println("Withdraw: " + amount + " | Balance: " + getBalance());
			} else {
				System.out.println(
						"Savings Error: Transaction denied! Balance cannot drop below minimum limit of " + minBalance);
			}
		}
	}

}
