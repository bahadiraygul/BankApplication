
public class Savings extends Account {
	// List properties specific to the Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetDepositBox();
	}
	
	@Override
	public void setRate() {
		rate =  getBaseRate() - .25;
		
	}
	
	private void setSafetDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		}
	// List any method specific to savings account
	public void showInfo() {
		System.out.println("ACOOUNT TYPE: SAVINGS");
		super.showInfo();
		System.out.println(
				"Your saving account features: " +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}

	
}
