package exercises.chapter3.Rectangle;

public class RectangleExecution {

	public static void main(String[] args) {
		
		
		Rectangle rechteck1 = new Rectangle(15.6, 19.5);
		
		System.out.println("Umfang=" + rechteck1.getPerimeter());
		System.out.println("Fläche=" + rechteck1.getArea());
		
		System.out.println("\n");
		System.out.println("Veränderung der Werte");
		rechteck1.setHeight(1893);
		rechteck1.setWidth(120);
		
		System.out.println("\n");
		System.out.println("Neue Werte");
		
		System.out.println("Umfang=" + rechteck1.getPerimeter());
		System.out.println("Fläche=" + rechteck1.getArea());

	}

}
