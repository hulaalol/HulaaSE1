package exercises.chapter1.ConvertUTF;

public class ConvertUTF {

	public static void main(String[] args) {
		
		
		char a = '9';
		int b = (int)a;
		byte c = (byte) b;
		
			System.out.println(b);
			System.out.println(Integer.toBinaryString(b));
			System.out.println("Wert von c=" + c);
			
		//b > 127 ? System.out.println(b); : System.out.println("2 Byte Unicode Zeichen"),
		

	}

}
