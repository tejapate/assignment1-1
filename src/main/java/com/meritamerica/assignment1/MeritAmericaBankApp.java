

package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	/* Runs the following parameters
	 * Instantiate an account holder with the name Eliana Cristina Betancur
	 * a checking account balance of $100 and a savings balance of $1000
	 * Deposit $500 into the checking account
	 * Withdraw $800 from the savings account
	 * Displays account information.
	 */
	
	public static void main(String[] args) {
	 AccountHolder eliana= new AccountHolder("Eliana","Cristina","Betancur","123-45-6789",100.00,1000.00);
	 System.out.println(eliana.toString());
	 CheckingAccount elianaCheckingAccount= eliana.getCheckingAccount();
	 elianaCheckingAccount.deposit(500.00);
	 SavingsAccount elianaSavingsAccount= eliana.getSavingsAccount();
	 elianaSavingsAccount.withdraw(800.00);
	 System.out.println(elianaCheckingAccount.toString());
	 System.out.println(elianaSavingsAccount.toString());
	 
	 /* 
	*Instantiates another account holder with the name Juan Javier Gonzalez
	*a checking account balance of $200 and a savings balance of $500
	*Deposit -$500 into the checking account
	*Withdraw $600 from the savings account
	*Display the second account's information
	*/
	 
	 AccountHolder juan= new AccountHolder("Juan","Javier","Gonzalez","123-45-6789",200.00,500.00);
	 System.out.println(juan.toString());
	 CheckingAccount juanCheckingAccount= juan.getCheckingAccount();
	 juanCheckingAccount.deposit(-500.00);
	 SavingsAccount juanSavingsAccount= juan.getSavingsAccount();
	 juanSavingsAccount.withdraw(800.00);
	 System.out.println(juanCheckingAccount.toString());
	 System.out.println(juanSavingsAccount.toString());
	 }
	
}