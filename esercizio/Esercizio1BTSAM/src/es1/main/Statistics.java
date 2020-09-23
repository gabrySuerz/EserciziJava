package es1.main;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Statistics {

	public double area;
	public double perimeter;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public Statistics(double perimeter, double area) {
		this.area = area;
		this.perimeter = perimeter;
	}

	public void add(Statistics s) {
		perimeter += s.perimeter;
		area = area + s.area;
	}

}
