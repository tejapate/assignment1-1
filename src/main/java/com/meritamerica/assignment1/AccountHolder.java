package com.meritamerica.assignment1;

/* Account Holder Requirements
 * Name:
 * SSN:
 * Checking Account Balance:
 * Checking Account Interest Rate:
 * Checking Account Balance in 3 years:
 * Savings Account Balance:
 * Savings Account Interest Rate:
 * Savings Account Balance in 3 years:
 * 
 */

public class AccountHolder {
	String firstName; 
	String middleName; 
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance; 
	double savingsAccountOpeningBalance;
	CheckingAccount checkingAccount;
	

	SavingsAccount savingsAccount;
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance,double savingsAccountOpeningBalance){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.checkingAccount = new CheckingAccount (checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount (savingsAccountOpeningBalance);
		
		
	}
		
	public String getFirstName() {
		return this.firstName;
	}
	public void	setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	@Override
	public String toString() {
	return "Name: "+ this.getFirstName() +" "+ this.getMiddleName()+" "+ this.getLastName()+ "\n"
			+"SSN: "+ this.getSsn()+ "\n"
			+this.getCheckingAccount()
			+this.getSavingsAccount();
	
		
	}
	
}