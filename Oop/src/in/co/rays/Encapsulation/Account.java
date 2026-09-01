package in.co.rays.Encapsulation;

public class Account {
	private String number;
	private String accountType;
	private Double balance;

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	public double deposite(Double balance) {

		int amount = 20;

		double Deposite = balance + amount;

		return Deposite;
	}

	public double withdrawl(Double balance) {

		int amount = 999912;
		if (amount > balance) {
			System.out.println("insufficient balance");
		}

		double Withdrawl = balance - amount;

		return Withdrawl;

	}

	public double fundTransfer(Double balance) {

		int fund = 1000;
		if (fund > balance) {
			System.out.println("insufficient funds");
		}

		double FundTransfer = balance - fund;

		return FundTransfer;
	}

	public double payBill(Double balance) {

		int bill = 912;

		double PayBill = balance - bill;

		return PayBill;
	}

}
