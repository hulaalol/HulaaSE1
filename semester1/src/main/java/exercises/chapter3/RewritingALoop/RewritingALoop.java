package exercises.chapter3.RewritingALoop;

public class RewritingALoop {

	  public static void main(String [] args) {
	    squareNumbers(1000);
	  }
	  
	  /**
	   * Compute all square numbers starting from 4 in steps of 3
	   * being smaller than a given limit. The results are being written to standard output.
	   * Implemented by a for -loop.
	   * 
	   * @param limit An upper exclusive bound for the highest number to be squared..
	   */
	  
	  
	  public static void squareNumbers(final int limit) {
		  
//	    System.out.println("Computing square numbers");
//	    for (int i = 4; i < limit; i += 3) {
//	      System.out.println("i = " + i + ", i * i = " + i * i);
//	    }
//	    System.out.println("Finished computing square numbers");
//	  }
	  
//		  System.out.println("Computing square numbers");
//	  
//		  int i = 4;
//		
//		  while (i<limit)
//		  {
//			  System.out.println("i = " + i + ", i * i = " + i * i);
//			  i+=3;
//			  
//		  }
//		  
//		  System.out.println("Finished computing square numbers");
		  
		  
		  
		  
		  System.out.println("Computing square numbers");
		  int i = 4;
		  do {
			 
			  System.out.println("i = " + i + ", i * i = " + i * i);
			  i+=3;
		  
		  } while (i<limit);
		  System.out.println("Finished computing square numbers");
	}
}