package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 * Edited by Sophia Qiu & Jason Wu 11.14.2017
 */
public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		// Equation to calculate Area
		return length*width;
	}


	public double calculatePerimeter() {
		// Equation to calculate Perimeter
		return 2*length+2*width;
	}


	public String toString() {
		// Returns the words that will be printed
		return " Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
