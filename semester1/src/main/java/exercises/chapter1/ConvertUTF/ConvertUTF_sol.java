package exercises.chapter1.ConvertUTF;

public class ConvertUTF_sol {
	    
	    
	    /**
	     * Contains a main method, that converts a char-value
	    * into its UTF-8 encoding.
	    * 
	    * @author Christian Pape
     */
    public class UnicodeToUTF8 {
	   
	       /**
         * Converts a char value into its UTF-8 encoding with
         * one expression. Note, that this solution is not quite
	         * readable. See the subsequent soltion for a better
	         * implementation.
	        */
	        public void main(String[] args) {
	            char c = 'ä';
	           int utf8 = 0;
	            
            System.out.println(Integer.toBinaryString(c));
	           
	            utf8 = ( 0 == (c & 0xFF80) 
	            		
	            													// at most the 7 lower bits are set in c
	                     ? c 										// then c itself is the UTF-8 encoding 
	                    :  (  0 == (c & 0xF800 ) 					// at most 11 Bits are set
	                        ? (  									// calculate bits for 1st byte of UTF-8 sequence
	                           (((c >> 6) & 0x001F) << 8 
	                              | 0xC000) ) 						// the leading 110
	                              									// 6 bits for 2nd byte of UTF-8 with
	                              | (c & 0x003F) 
	                             | 0x0080 							// leading 10
	                        : ( 									// c has 12-16 bits set
	                        										// 1st byte
	                              (c >> 12 & 0x0F | 0xE0) << 16
	                            | 									// 2nd and 3rd byte
	                            (((c >> 6) & 0x003F) << 8  | 0x8000) ) 
	                               | (c & 0x003F) | 0x0080
	                            ) ) ;
	            
	            
	            
	            
	           
	            
	            System.out.println(Integer.toBinaryString(utf8));
	            
	            														//a more readable implementation (not tested)
	            if ( 0 == (c & 0xFF80) ) { 								// at most 7 bits are set in c
	                utf8 = c;
	            } else if ( 0 == (c & 0xF800 ) ) { 						// at most 11 bits
	                utf8 = (((c >> 6) & 0x001F) << 8 
	                        | 0xC000 ) 									// leading 110 for 1st byte
	                        |(c & 0x003F) 
	                        | 0x0080; 									//  leading 10 for 2nd byte                    
	            } else { 												// at least 12 bits are set
	                utf8 = (c >> 12 & 0x0F | 0xE0) << 12 				// 1st byte
	                        											// 2nd and 3rd byte
	                        | (((c >> 6) & 0x003F) << 8  | 0x8000)
	                        | (c & 0x003F)
	                        | 0x0080;
	            }
	            
	            
	            
	            
	            
	            
	            
	            
	            // another implementation with intermediate results stored in variables
	            // (not tested)
	            int  byte1 = 0,
	                 byte2 = 0, 
	                 byte3 = 0;
	            
	            if ( 0 == (c & 0xFF80) ) { 									// at most 7 bits are set in c
	                byte3 = c;
	            } else if ( 0 == (c & 0xF800 ) ) { 							// at most 11 bits
	                byte2  = ((c >> 6) & 0x001F) | 0xC0; 
	                byte3 =  (c & 0x003F) | 0x0080; 						//leading 10 for 2nd byte
	                        
	            } else { 													// at least 12 bits are set in c
	                byte1 = (c >> 12 & 0x0F | 0xE0);
	                byte2 = (((c >> 6) & 0x003F) | 0x80);
	                byte3 = (c & 0x3F)| 0x80;
	            }
	            utf8 = (byte1 << 16) | (byte2 << 8) | byte3;
	        }
    }
}
	    
	    

