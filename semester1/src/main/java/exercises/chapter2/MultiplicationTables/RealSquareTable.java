package exercises.chapter2.MultiplicationTables;

public class RealSquareTable {

		public static void main(String[] args) {
			final int tabellenGroesse = 20; // Maximale Quadratzahl

			
			// Tabellenkopf mit n | n*n
			for (int col = 0; col < 5; col++) {
				System.out.print("  n  | n*n    ");
			}
			System.out.print("\n");
			for (int col = 0; col < 5; col++) {
				System.out.print("-----+--------");
			}

			
			//Hauptblock
			for (int row = 1; row <= tabellenGroesse; row++) { 
				System.out.print("\n");

				if (row % 11 == 0 && row != 0) // Trennstrich
				{
					for (int trennstrichBlock = 0; trennstrichBlock < 5; trennstrichBlock++) {
						System.out.print("-----+--------");
					}
					System.out.print("\n");
				}
				
				for (int col = 0; col <= 4; col++) {

					System.out.format("%3d  | %-4d   ",
							((col * tabellenGroesse) + row),
							((col * tabellenGroesse) + row)
									* ((col * tabellenGroesse) + row));

				}

			}
		}
	
	    


	
	
	
}
