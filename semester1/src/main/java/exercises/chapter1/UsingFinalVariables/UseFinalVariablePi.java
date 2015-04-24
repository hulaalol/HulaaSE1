package exercises.chapter1.UsingFinalVariables;

public class UseFinalVariablePi {

	
		   public static void main(String[] args) {
			      
			      double radius = 2.31;   // A circle having a radius (given e.g. in mm).
			      final double pi = 3.1415926;  // Constant relating a square's radius, perimeter and area.
			   
			  // Some lines of code in between
			  // ...

			     //pi = -17; // Woops! This shall not happen!

			  // More lines of code
			  // ...
			      
			      final double area = pi * radius * radius;
			      System.out.println(area);
			   }

	

}
