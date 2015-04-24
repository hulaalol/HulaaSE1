package exercises.chapter3.FormattingSinus;

public class FormattingSinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int maxSin = 330;
			System.out.print("  x  | sin(X)");
			System.out.print("\n");
			System.out.print("-----+-------");
			System.out.print("\n");
	
			for (double n = 5; n <= maxSin; n+=5) {
				
				System.out.format("%5.0f|", n );
				System.out.format("%6.3f",((Math.sin(Math.toRadians(n)))));
				System.out.print("\n");
				
			}

	
	}
}


