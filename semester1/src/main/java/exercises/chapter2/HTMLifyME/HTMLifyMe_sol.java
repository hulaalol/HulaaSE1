package exercises.chapter2.HTMLifyME;

public class HTMLifyMe_sol {
	

	  public static void main(String[] args) {
	      
	      final int limit = 20;               // The number of records to be printed
	      
	      System.out.print(
	            ""    + "<html xmlns='http://www.w3.org/1999/xhtml'>\n"
	                  + "  <head>\n"
	                  + "    <title>A square table</title>\n"
	                  + "  </head>\n"
	                  + "  <body>\n"
	                  + "    <table>\n");

	      
	      System.out.println("      <tr>");
	      System.out.println("        <th>n</th><th>n * n</th>");
	      System.out.println("      </tr>");
	      
	      for (int i = 0; i <= limit; i++) {  // Printing the table's body
	         
	         System.out.println("      <tr>");
	         System.out.println("        <td style='text-align: right;'>" + i + "</td><td style='text-align: right;'>" + i * i + "</td>");
	         System.out.println("      </tr>");
	         
	      }
	      System.out.print(
	            ""    + "    </table>\n"
	                  + "  </body>\n"
	                  + "</html>\n");
	  }
}
