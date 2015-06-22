package de.hdm_stuttgart.mi.sd1.Figure;

public class Rectangle extends Figure {
	
	double height;
	double width;

	public Rectangle(double x, double y) {
		super(x, y);
		this.height = x;
		this.width = y;
		
	}

	@Override
	public double getPerimeter() {
		
		return ((2*width)+(2*height));
	}

	@Override
	public double getArea() {
		return (width*height);
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setWidth(double newWidth){
		this.width = newWidth;
	}

	public void setHeight(double newHeight){
		this.height = newHeight;
	}
	
}
