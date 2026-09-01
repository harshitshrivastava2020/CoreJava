package in.co.rays.Overriding.java;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;
	private String businessName;

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessName() {
		return businessName;
	}

	public boolean allowOverdraft(double amount) {
		return amount <= getBalance() + overdraftLimit;
	}

	public void chargeFee() {
		double fee = 100;
		if (getBalance() >= fee) {
			setBalance(getBalance() - fee);
			System.out.println("Transaction fee charged: " + fee);
		}
	}

	@Override
	public void deposit(double amount) {
		System.out.println("[Business Deposit for " + businessName + "] ");
		if (amount > 0) {
			super.deposit(amount);
		} else {
			System.out.println("Current Account Error: Invalid deposit amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
			if (allowOverdraft(amount)) {
				setBalance(getBalance() - amount);
				System.out.println("Current Account: Withdrawal successful.");
				System.out.println("Withdraw: " + amount + " | Balance: " + getBalance());
			} else {

				System.out
						.println("Current Account Error: Denied! Overdraft limit of " + overdraftLimit + " exceeded.");
			}
		}

	}
}
