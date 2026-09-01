package in.co.rays.Overriding.java;

public class BankAccount {
	private int accountNo;
	private String holderName;
	private double balance;
	private String branch;
	private String status;

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println(" Amount deposited successfully");
			System.out.println(" Deposit: " + amount + " | Balance: " + balance);
		}

	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
			System.out.println("Base Withdraw:" + amount + "| Balance: " + balance);
		} else {
			System.out.println(" Error: Insufficient funds");
		}

	}

	public double checkBalance() {
		return balance;
	}

	public void closeAccount() {
		this.status = "CLOSED";
		System.out.println("Account " + accountNo + " is closed.");
	}

}
