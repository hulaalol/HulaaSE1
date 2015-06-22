package de.hdm_stuttgart.mi.sd1.Figure;

public class Circle extends Figure {
	
	public double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
		
	}

	@Override
	public double getPerimeter() {
		
		return 2*(Math.PI)*radius;
	}

	@Override
	public double getArea() {
		
		return (Math.PI*radius*radius);
	}

	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius)
	{
		this.radius = newRadius;
	}
	
	
}
