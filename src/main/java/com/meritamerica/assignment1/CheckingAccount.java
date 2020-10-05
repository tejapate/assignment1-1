package com.meritamerica.assignment1;

/* This is the Checking Account
 * Checking Account Balance: $100
 * Checking Account Interest Rate: 0.0001
 * Checking Account Balance in 3 years: $100.03
 */

public class CheckingAccount {
	double balance; 
	double interestRate;

	public CheckingAccount (double openingBalance) {
		this.balance = openingBalance;
		this.interestRate = 0.0001;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public boolean withdraw (double amount) {
		if (this.getBalance()>= amount) {
			double newBalance = this.getBalance()- amount;
			this.setBalance(newBalance);
			return true;
		}
		return false;
	}
	public boolean deposit (double amount) {
		if (amount < 0) {
			return false;
		}
		double newBalance = this.getBalance()+ amount;
		this.setBalance(newBalance);
		return true;
	}
	public double futureValue(int years) {
		double futureValue = this.getBalance()*Math.pow(1+this.getInterestRate(),years);
		return futureValue;
	}
	public String toString () {
		return "Checking Account Balance: $"+ String.format("%.2f",this.getBalance())+ "\n"
				+"Checking Account Interest Rate: "+ String.format("%.4f",this.getInterestRate())+ "\n"
				+"Checking Account Balance in 3 years: $"+ String.format("%.2f", this.futureValue(3))+ "\n";
		
	}
	
}