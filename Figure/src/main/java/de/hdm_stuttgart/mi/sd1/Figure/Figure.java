package de.hdm_stuttgart.mi.sd1.Figure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 *  see file log4j2.xml for configuration options.
 * 
 */

public abstract class Figure {

private double x;
private double y;

public Figure(double x, double y)
{
	this.x = x;
	this.y = y;
}

public abstract double getPerimeter();
public abstract double getArea();

public double getX() {
	return this.x;
}

public double getY() {
	return this.y;
}

public void setY(double a) {
	this.y = a;
}

public void setX(double a) {
	this.x = a;
}

public Figure move (double x, double y){
	
	this.x += x;
	this.y += y;
	
	return this;
	
	
}





}
