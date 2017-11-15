/**
 * @author  Sophia Qiu & Jason Wu 11.14.2017
 * 
 */


package shapes;

public class Trapezoid implements Shape {
	//variables
	private int base1;
	private int base2;
	private int side1;
	private int side2;
	private int height;
	
	
	public Trapezoid (int base1, int base2, int side1, int side2, int height) {
		this.base1 = base1;
		this.base2 = base2;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	
	

	public double calculateArea() {
		// Equation to calculate Area
		return ((base1+base2)/2)*height;
	}
	

	@Override
	public double calculatePerimeter() {
		// Equation to calculate Perimeter
		return (base1+base2+side1+side2);
	}
	
	
	
	@Override
	public String toString() {
		// Returns the words that will be printed
		return " Trapezoid Base 1: " + base1 + " Trapezoid Base 2: " + base2 + " Trapezoid Side 1:" + side1 + " Trapezoid Side 2: " + side2 + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}
	
}