package p1;

// bean class or POJO (Plain old java object) or entity class
// business object / entity
public class Account {
	
	private int accountNumber;
	private String accountHolderName;
	private int balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// -----
	
	public int fundTransfer(int amount)
	{
		if(amount<(balance-500))
		{
			// code to transfer the fund
			
			// update balance
			balance-=amount;
		}
		return balance;
	}
	
	public int deposit(int amount)
	{
		balance+=amount;
		return balance;
				
	}
	

}//end class


/*
Account ramesh = new Account();
ramesh.balance = 1000;
ramesh.setBalance(2000);

Account mike = new Account();
mike.balance = 2000;
int balance  = mike.getBalance();

*/