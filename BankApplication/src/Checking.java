
public class Checking extends Account {
	// List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	// List any method specific to the checking account
	public void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 3));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate =  getBaseRate() * .15;
		
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" +
							"\nDebit Card Number: " + debitCardNumber +
							"\nDebit Card PIN:" + debitCardPIN);
	}
	
}
