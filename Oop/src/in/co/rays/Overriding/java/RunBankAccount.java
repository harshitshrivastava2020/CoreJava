package in.co.rays.Overriding.java;

public class RunBankAccount {
public static void main(String[] args) {
    BankAccount b = new SavingAccount();
    
    SavingAccount sa = (SavingAccount)b;
    sa.setAccountNo(2222);
   sa.setHolderName("Harshit");
    sa.setBalance(500.00);
  sa.setBranch("indore");
  sa.setStatus("ACTIVE");
   sa.setInterestRate(2);
	sa.setMinBalance(10000);
	
	sa.deposit(500);
	sa.withdraw(600);
	sa.addInterest();
	System.out.println("--------------------------------");

	BankAccount b1 = new CurrentAccount();

    CurrentAccount ca = (CurrentAccount)b1;
    ca.setAccountNo(3333);
    ca.setHolderName("Chinmay");
    ca.setBalance(1490000.9);
    ca.setBranch("indore");
    ca.setStatus("ACTIVE");
    ca.setBusinessName("ABC Pvt Ltd");
	ca.setOverdraftLimit(50000);

	ca.deposit(3000);
	ca.withdraw(500000);
}
}
