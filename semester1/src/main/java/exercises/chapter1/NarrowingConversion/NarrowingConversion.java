package exercises.chapter1.NarrowingConversion;

public class NarrowingConversion {
	
	public static void main (String[] args)
	{
	
		short minumum = (short) 0B10000000_00000000;
		short maximum = 0B01111111_11111111;
		
			System.out.println("Minimum short value:" + minumum);
			System.out.println("Maximum short value:" + maximum);
		
	}
}
