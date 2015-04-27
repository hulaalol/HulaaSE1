package de.hdm_stuttgart.mi.sd1.gcd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 *  see file log4j2.xml for configuration options.
 * 
 */
public class Math {
	
	long a;
	long b;
	
	
    private static Logger log = LogManager.getLogger(Math.class);

    
    
    /**
     * @param args Unused
     */
    
    
    private static long getGCD(long a, long b)
    {
//    	if (a > b)
//    	{
//    		long copyA = a;
//    		long copyB= b;
//    		
//    		a = copyB;
//    		b = copyA;
//    	}
//    	
    	if (b==0)
    	{
    		
    		System.err.print("Division by zero not allowed lol!");
   
    	}
    	
    	if (a==0)
    	{
    		return 0;
    	}
    	
    	
    	for ( ; ; )
    	{
    	if (b!=0)
    	{
    	long remainder = a%b;
    	
    	if (remainder==0){
    		return b;
    	}
    	
    	long CopyB = b;
    	a = b;
    	b = remainder;
    	}
    	}
    	
    	
    }
    
    
    public static void main( String[] args ) {
        System.out.println(getGCD(188,0));
        
        log.debug("With respect to logging you may want to configure file ");
        log.debug("'src/main/resources/log4j2.xml' to suit your needs.");
        log.debug("This config file 'log4j2.xml' will result in 'A1.log'");
        log.debug("file containing logging output as well.");
    }
}
