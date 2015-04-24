package exercises.chapter2.ExamMark;
import java.util.Scanner;

public class ExamMark {



		public static void main(String[] args) {
		      
			final Scanner scan = new Scanner(System.in);   // Read user input: User decides of how many lines the tree exists
			System.out.print("Reached Points: ");
			final int pointsReached = scan.nextInt();
			
		      int maximumPoints = 12;
		      int pointsToAdd = 3;
		      
				if (pointsReached>maximumPoints)
				{
					System.err.println("ERROR: Maximum of Points is "+maximumPoints+"! \n");
				} 
				else
				{
			
		      final int newResult = pointsReached + pointsToAdd;
		      
		      if (newResult>=12)
		      {
		    		    System.out.println("New Result: Maximum of 12 points reached! Student had " 
		    			    	  + pointsReached + " Points before Bonus!");  
		    	  
		      }else
		      {
		    	  System.out.println("New Result: " + newResult + " Points reached");  
		      }
				}
		   }

	}

	

