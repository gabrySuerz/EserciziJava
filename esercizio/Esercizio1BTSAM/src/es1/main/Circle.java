package es1.main;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Circle implements Shape{

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.pow(this.radius, 2) * Math.PI;
	}

	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

}
