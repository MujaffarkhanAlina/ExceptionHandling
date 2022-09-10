package com.userdefineexception;

public class CheckingAccount {
	
	private double balance;
	
	   
	 
	   
	   public void deposit(double amount) {
	      balance += amount;
	   }
	   
	   public void withdraw(double amount) throws InsufficientFundsException {
	      //  600<=300;
		   if(amount <= balance) {
	         
	    	 // balance -= amount;
	    	  
	    	  balance = balance-amount;
	      
	      
	      }else {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	   }
	   
	   public double getBalance() {
	      return balance;
	   }
	   
	   
}
