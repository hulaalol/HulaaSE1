package exercises.chapter1.GuessingResultsPostPreFix;

public class GuessingResultsPostPreFix {

	
	public static void main(String[] args) {
		
	      int a = 3;
	      a++;          //Incrementing a by 1 --> a==4

	      int b = a;    // a = 4 , b = 4

	      b--;          // b = 3
	      --b;          // b = 2
	      int c = b;    // b = 2, c = 2

	      b = ++a;      // a = 5 , b = 5
	      int e = a++;  // e = 5 , a = 6

	      a *= b;       // a = 30

	      System.out.println("a=" + a);
	      System.out.println("b=" + b);
	      System.out.println("c=" + c);
	      System.out.println("e=" + e);
	      
	}
}