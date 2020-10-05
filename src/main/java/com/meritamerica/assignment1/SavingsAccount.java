package com.meritamerica.assignment1;

public class SavingsAccount {
	double balance; 
	double interestRate;
	
	public SavingsAccount (double openingBalance) {
		this.balance = openingBalance;
		this.interestRate = 0.01;
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
		return "Savings Account Balance: $"+ String.format("%.2f",this.getBalance())+ "\n"
				+"Savings Account Interest Rate: "+ String.format("%.2f", this.getInterestRate())+ "\n"
				+"Savings Account Balance in 3 years: $"+ String.format("%.2f",this.futureValue(3))+"\n";
		
	}
	
}