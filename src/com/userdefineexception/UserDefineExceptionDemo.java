package com.userdefineexception;

public class UserDefineExceptionDemo {


	public static void main(String [] args) {
	      
		 CheckingAccount c = new CheckingAccount();
	      
	      System.out.println("Depositing $400");
	      
	      c.deposit(400.00);
	      
	        try {
	         System.out.println("\nWithdrawing $400...");
	        c.withdraw(100.00); 
	         System.out.println("\nWithdrawing $300...");
	         c.withdraw(600.00);
	        }catch (InsufficientFundsException e) {
	         System.out.println("Sorry, but you are short $" + e.getAmount());
	         e.printStackTrace();
	      } 
	   }

}
