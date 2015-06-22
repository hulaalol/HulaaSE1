package de.hdm_stuttgart.mi.sd1.Figure;

public class driver {

	public static void main(String[] args) {
		
		
		Circle kreis1 = new Circle(20,20,500);
		System.out.println(kreis1.getArea());
		System.out.println(kreis1.getPerimeter());
		System.out.println(kreis1.getX());
		System.out.println(kreis1.getY());
		
		kreis1.move(34, 34);
		kreis1.move(34, 34);
		kreis1.move(34, 34);
		kreis1.move(34, 34);
		kreis1.move(34, 34);
		
		
		System.out.println(kreis1.getArea());
		System.out.println(kreis1.getPerimeter());
		System.out.println(kreis1.getX());
		System.out.println(kreis1.getY());
		
	}

}
