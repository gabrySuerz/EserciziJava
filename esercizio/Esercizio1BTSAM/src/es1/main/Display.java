package es1.main;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Display {

	private Shape[] shapes;

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public double totalArea() {
		double tot = 0;
		for (Shape sha : this.shapes) {
			tot += sha.area();
		}
		return tot;
	}
	
	public double totalPerimeter() {
		double tot = 0;
		for (Shape sha : this.shapes) {
			tot += sha.perimeter();
		}
		return tot;
	}

}
