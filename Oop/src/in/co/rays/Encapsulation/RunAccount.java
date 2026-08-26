package in.co.rays.Encapsulation;

public class RunAccount {
	public static void main(String[] args) {
		Account acc = new Account();

		acc.setNumber("2234 4467 1123 9987");
		acc.setAccountType("Savings Account");
		acc.setBalance(999912.555);

		System.out.println("account number: " + acc.getNumber());
		System.out.println("accountType: " + acc.getAccountType());
		System.out.println("balance: " + acc.getBalance());
		System.out.println("balance Deposite : " + acc.deposite(acc.getBalance()));
		System.out.println("withdrawl : " + acc.withdrawl(acc.getBalance()));
		System.err.println("fundTransfer: "+acc.fundTransfer(acc.getBalance()));
		System.err.println("payBill: "+acc.payBill(acc.getBalance()));



	}
}
