package shapes;

public class Triangle implements Shape {
	
	private int height;
	private int base;
	
	public Triangle (int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double calculateArea() {
		// to be implemented by student
		return (0.5*base*height);
	}

	@Override
	public double calculatePerimeter() {
		// to be implemented by student
		return base*3;	
	}
	
	@Override
	public String toString() {
		// To be written by student
		return " Triangle Base: " + base + " Triangle Height: " + height + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
