package exercises.chapter2.HTMLifyME;

public class HTMLifyMe {

		public static void main(String[] args) {

	        
			        System.out.print("<html xmlns=\"http://www.w3.org/1999/xhtml\">"
			        		+ "\n"
			        		+ "\n"
			        		+ "<head>"
			        		+ "\n"
			        		+ "<title> Marcels Square Table </title>"
			        		+ "\n"
			        		+ "</head>"
			        		+ "\n"
			        		+ "\n"
			        		+"<body>"
			        		+"\n"
			        		+"\n"
			        		+"<table style=\"width:100px\">"
			        		+"\n");
			        
	       System.out.print("<tr> \n <td style=\"text-align: right;\">" + "n" + "</td> \n <td style=\"text-align: right;\">" + "n*n" + "</td> \n</tr> \n");
	       
	       int limit = 20;
	        for (int i=0; i<=limit; i++)
	        {
	        	System.out.print("<tr> \n  <td style=\"text-align: right;\" >" + i + " </td> \n  <td style=\"text-align: right;\" >" + i*i + " </td> \n</tr> \n");
	        	//System.out.format("%4d | %4d", i, i*i);
	        	//System.out.print( "\n" );
	        }
	        
	        System.out.print("\n"
	        		+ "</table>"
	        		+ "\n"
	        		+ "</body>"
	        		+ "\n"
	        		+ "</html>");
			
			
			

		}

	}

	
	

