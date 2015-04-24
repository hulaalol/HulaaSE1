package exercises.chapter2.MultiplicationTables;

public class TidyUpTheMess {

	    public static void main( String[] args )
	    {
	    	int limit = 20;
	        System.out.println( "  n  | n*n " );
	        System.out.println( "-----------" );
	        
	        for (int i=0; i<=limit; i++)
	        {
	        	System.out.format("%4d | %4d", i, i*i);
	        	System.out.print( "\n" );
	        }
	    }
	}
	

