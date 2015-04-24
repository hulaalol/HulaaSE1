package exercises.chapter2.PythagoreanTriplets;

public class PythagoreanTriplets {

		public static void main(String[] args) {

			// Bedingung 1:		(a * a) + (b * b) = (c * c)
			
			// Bedingung 2:		a<=b<c						
			// Bedingung 3:		a+b+c = 1000
			//					--> Bedeutet aMax=333 bMax=333 cMax=334

			for (int a = 1; a < 333; a++) { 		// Starte a bei 1, maximalwert 333

				int bPLUSc = 1000 - a; 	// b und c zusammen sind 1000 minus aktueller a-Wert
				int aSquare = a * a; 	//a Quadrat
				final int bmax; 		// Maximalwert für B initialisieren
				int c; 					// c-Wert erstellen
				

				if (bPLUSc % 2 == 0) 				//Wenn B+C durch 2 teilbar ist, 
				{
					bmax = (bPLUSc / 2) - 1; 		// --> ist bmax = b+c-1 da c>b sein muss.
					c = bPLUSc - bmax;				// --> daraus resultiert c = b+c-b
				} 
				else 								//Ween B+C nicht durch 2 teilbar ist,
				{
					bmax = bPLUSc / 2;				//--> ist bmax = bPLUSc durch 2 ohne den Rest 1! daher ergibt sich c>b
					c = bPLUSc - bmax;				//--> daraus resultiert c=b+c-b
				}
				

				for (		int b = a; 		//Erstelle den b-Wert und setze ihn gleich mit a, da a<=b!
							b < bmax;		//b-Wert < bmax!
							b++				//erhöhe b-Wert um 1 nachdem die if Bedingung geprüft wurde.
					) 
				{	
					c = bPLUSc - b;			//neuer c-Wert ist jetzt c=b+c-b (mit aktuellem b-Wert und nicht mit bmax!)

					if ((aSquare) + (b * b) == (c * c))  // Überprüfe die Bedingung 1 auf die zutreffenden Zahlenpaare,
														 // welche Bedingung 2 und 3 erfüllen.
					{
						System.out.println("(" + a + ", " + b + ", " + c + ")"); //Ausgabe
					}

				}

			}

		}

	}

	
	
	
	
	
	

