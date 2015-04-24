package exercises.chapter2.HTMLifyME;

public class SophisticatedHTML {

		public static void main(String[] args) {

			// generating HTML-header with CSS-Style for table
			System.out
			.print("<html xmlns=\"http://www.w3.org/1999/xhtml\">"
					+ "\n"
					+ "\n"
					+ "<head>"
					+ "\n"
					+ "<title> Marcels Square Table </title>"
					+ "\n"
					+ "<style>"
					+ "\n"
					+ "td {text-align:right; border: 2px solid black; }"
					+ "\n"
					+ ".CC {background-color:gray;}"
					+ "\n"
					+ "\n"
					+ "table {width:30%; border: 2px solid black; border-collapse:collapse; font-family:Arial,sans-serif;}"
					+ "\n" + "</style>" + "\n" + "</head>" + "\n" + "\n"
					+ "<body>" + "\n" + "\n" + "<table>" + "\n");

			//building Table-header
			System.out.print("<tr>");
			for (int col = 0; col < 5; col++) {
				if (col % 2 == 0) {
					System.out.print("\n <td>" + "n" + "</td> \n <td>" + "n*n"
							+ "</td> \n");
				} else {
					System.out.print("\n <td class='CC'>" + "n"
							+ "</td> \n <td class='CC'>" + "n*n" + "</td> \n");
				}
			}
			System.out.print("</tr>");
			
			// main code for generating rows and columns

			final int tabellenGroesse = 20; // number of listings per column, 5 columns! (tabellenGroesse*5)² = biggest Squarenumber
			
			
			for (int row = 1; row <= tabellenGroesse; row++) {

				System.out.print("\n");
				System.out.print("<tr>");
				System.out.print("\n");

				for (int col = 0; col <= 4; col++) {

					if (col % 2 == 0) {
						System.out.print("   <td>"
								+ ((col * tabellenGroesse) + row)
								+ "</td>\n   <td>"
								+ ((col * tabellenGroesse) + row)
								* ((col * tabellenGroesse) + row) + " </td> \n");
					} else {
						System.out.print("   <td class=\"CC\">"
								+ ((col * tabellenGroesse) + row)
								+ "</td>\n   <td class=\"CC\">"
								+ ((col * tabellenGroesse) + row)
								* ((col * tabellenGroesse) + row) + "</td> \n");
					}

				}
				System.out.print("</tr>");

			}
			// close all HTML-Tags
			System.out.print("\n" + "</table>" + "\n" + "</body>" + "\n"
					+ "</html>");
		}
	}

	
	

