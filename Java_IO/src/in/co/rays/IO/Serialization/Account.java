package in.co.rays.IO.Serialization;

import java.io.Serializable;

public class Account implements Serializable {
	public String accountNo;
	public transient double balance;

	public Account(String a, double b) {
		this.accountNo = a;
		this.balance = b;
	}

	public String toString() {
		return "accountNo: " + accountNo + "balance" + balance;
	}

}