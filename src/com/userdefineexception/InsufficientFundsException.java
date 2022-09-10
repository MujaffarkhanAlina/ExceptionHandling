package com.userdefineexception;

public class InsufficientFundsException extends Exception {
	   
	   private double amt;
	   
	   public InsufficientFundsException(double amt) {
	      this.amt = amt;
	   }
	   
	   public double getAmount() {
	      return amt;
	   }
	}