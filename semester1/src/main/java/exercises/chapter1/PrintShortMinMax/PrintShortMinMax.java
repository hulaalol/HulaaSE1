package exercises.chapter1.PrintShortMinMax; 


public class PrintShortMinMax {
	
	public static void main(String[] args) {
	
		//short minumum = (short) 0B11111111_11111111,
			//  maximum = 0B01111111_11111111;

			//System.out.println("Minimum short value:" + minumum);
			//System.out.println("Maximum short value:" + maximum);
	
			byte test1 = 0B00000000;
			byte test2 = 0B01000001;
			
			long a = 128L;   // long-wert 126
			
			byte b = (byte) a; // long-wert 128 narrowing conversion in byte fails!!! Überlauf!


					//System.out.println("Minimum short value:" + test1);
					//System.out.println("Maximum short value:" + test2);
					System.out.println("Maximum short value (long):" + a);
					System.out.println("Maximum short value (byte):" + b); 
	
}
}