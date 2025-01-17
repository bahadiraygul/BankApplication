
public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfsSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfsSN + uniqueID + randomNumber;
		
		
	}
	
	public void compound() {
		double accuredInterest = balance * (rate/100);
		balance += accuredInterest;
		System.out.println("Accured Interest:" + accuredInterest);
		printBalance();
	}
	// List common methods - transactions
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transferin $" + amount + "to" + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Balance is $:" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBalance: " + balance +
				"\nRate :" + rate + "%");
	}
}
