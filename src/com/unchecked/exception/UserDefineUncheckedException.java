package com.unchecked.exception;

import java.util.ArrayList;

public class UserDefineUncheckedException {
	
	
	   ArrayList<String> student =new ArrayList<>();
	   
	   public void addStudent(String name) throws UncheckedException
	   {
	      
	      if(student.contains(name))
	      {
	         throw new UncheckedException(name + " Already Present in the List");
	      }
	      else
	      {
	        
	         student.add(name);
	         System.out.println(name + " Added Into the Student List");
	      }
	   }
	   public static void main(String[] args) 
	   {
		  try {
		   UserDefineUncheckedException obj = new UserDefineUncheckedException();
	      obj.addStudent("Harish");
	      obj.addStudent("Sonali");
	      obj.addStudent("Bala");
	      obj.addStudent("Harish");
		  }catch(UncheckedException e) {
			  
			  System.out.println("Exception 1"+e);
		  }
	      
	      System.out.println("Statement1.....");
	      System.out.println("Statement2.....");
	      System.out.println("Statement3.....");
	      System.out.println("Statement4.....");
	      
	   }
	
	

}
