package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */

public class Square implements Shape {

	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double area() {
		return Math.pow(this.side, 2);
	}

	public double perimeter() {
		return 4 * this.side;
	}
	
}
