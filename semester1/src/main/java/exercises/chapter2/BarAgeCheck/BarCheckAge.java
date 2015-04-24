package exercises.chapter2.BarAgeCheck;

import java.util.Scanner;

public class BarCheckAge {
	
	   public static void main(String[] args) {
		    
		      final Scanner scan = new Scanner(System.in); // Read user input
		      System.out.print("Your order:\n  1=Beer\n  2=Orange juice:");
		      final int beverageChoice = scan.nextInt();
		      
		      
		      
		      
		      if (beverageChoice == 1)
		      {
		    	  final Scanner ageInput = new Scanner(System.in); // Read user input
		          System.out.print("How old are you?");
		          final int userAge = ageInput.nextInt();
		          
		          final int userAgeTooYoung = 16-userAge;
		          
		          
		          
		          
		          
		          
		          if (userAge<16)
		          {
		        	  
		        	  if (userAge==15)
		        	  {
		        		  System.out.println("Sorry you need to wait " + userAgeTooYoung + " Year to buy beer"); 
		        	  }
		        	  else
		        	  {
		        		  System.out.println("Sorry you need to wait " + userAgeTooYoung + " Years to buy beer");  
		        	  }
		          }
		          else
		          {
		        	  System.out.println("Here is your beer");
		          }
		          
		       } 
		        
		      
		      if (beverageChoice ==2)
		      {
		    	  System.out.println("Here is your orange juice");
		      }
		      
		      
		      if (beverageChoice!=2 && beverageChoice!=1)
		      {
		    	  System.out.println("Sorry, i can't understand your order");
		      }
		 
		      scan.close();
		   }
		}


