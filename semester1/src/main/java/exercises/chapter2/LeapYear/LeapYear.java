package exercises.chapter2.LeapYear;

import java.util.Scanner;

public class LeapYear {

   public static void main(String[] args) {
    
      final Scanner scan = new Scanner(System.in); // Read user input
      System.out.print("Enter a year:");
      final int inputYear = scan.nextInt();
      
      /*
       *  	Die Jahreszahl durch 4 teilbar ist.
			Ausnahme 1: Ist die Jahreszahl durch 100 teilbar ist i.d.R. KEIN Schaltjahr.
			Ausnahme 2: Ist die Jahreszahl durch 400 teilbar ist IMMER ein Schaltjahr.
			
			
			Eingabe --> durch 4 teilbar? --> durch 100 und 400 teilbar? --> schaltjahr
										--> durch 100 teilbar und nicht durch 400 teilbar --> kein Schaltjahr
										--> ansosten --> Schaltjahr
       */
      
      
      if (inputYear%4==0)
      {
    	  if (inputYear%100==0 && inputYear%400==0)
    	  {
    		  System.out.println("The Year " + inputYear + " is a leap year!");
    	  }
    	  
    	  if (inputYear%100==0 && inputYear%400!=0)
    	  {
    		 System.out.println("The Year " + inputYear + " is NOT a leap year!");
    	  }
    	  
    	if ((inputYear%100!=0 && inputYear%400!=0) && (inputYear%4==0))
    		{
    		System.out.println("The Year " + inputYear + " is a leap year!");
    		}  
      }
      else
      {
    	  System.out.println("The Year " + inputYear + " is NOT a leap year!");
      }
      
      
      scan.close();
   }
}