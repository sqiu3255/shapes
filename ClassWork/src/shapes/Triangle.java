/**
 * @author  Sophia Qiu & Jason Wu 11.14.2017
 * 
 * This is under the assumption that the triangle is equilateral 
 */


package shapes;

public class Triangle implements Shape {
	
	private int side1;	
	private int side2;
	private int height;
	private int base;
	
	public Triangle (int base, int height, int side1, int side2) {
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double calculateArea() {
		// Equation to calculate Area
		return (0.5*base*height);
	}

	@Override
	public double calculatePerimeter() {
		// Equation to calculate Perimeter
		return base+side1+side2;	
	}
	
	@Override
	public String toString() {
		// Returns the words that will be printed
		return " Triangle Base: " + base + " Triangle Height: " + height + " Side 1: " + side1 + " Side 2: " + side2 + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
}
