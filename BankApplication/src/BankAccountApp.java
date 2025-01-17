import java.util.LinkedList;
import java.util.List;

import javax.swing.text.Utilities;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		
		/*
		Checking chkacc1 = new Checking("Bahadir Aygul","123456789",1500);
		Savings savacc1 = new Savings("Ahmet Aygul","234567892",2500);
		
		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("***************");
		chkacc1.showInfo();
		*/
		
		// Read a CSV file then create new accounts based on that data
		String file = "C:\\Users\\Ahmed Aygül\\Desktop\\Masaüstü\\NewBankAccounts.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);  
		for (String[] accountHolder: newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + " " + "$" + initDeposit);
			if (accountType.equals("Savings")){
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			 else if(accountType.equals("Checking")){
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
					
		}
		
		for(Account acc: accounts) {
			System.out.println("\n*************");
			acc.showInfo();
		}
	}

}
