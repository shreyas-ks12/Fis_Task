package p1;

public class MainClass {

	public static void main(String[] args) {
		MainClass obj = new MainClass();
		Account accounts[] = new Account[3];
		
		/*
		 do not use for data manipulations 
		for (Account account : accounts) {
			account = new Account();
			// account is read-only
			 // having local block access
		}
		
		*/
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
		}
		
		System.out.println(accounts[0]);

		obj.setAccounts(accounts);
		obj.displayDetails(accounts);
	}
	
	public void setAccounts(Account accounts[])
	{
		for (Account account : accounts) {
			account.setBalance(2000);
		}
	}
	
	public void displayDetails(Account accounts[])
	{
		for (Account account : accounts) {
			System.out.println(account.getBalance());
		}
	}

}
