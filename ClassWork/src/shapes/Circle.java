package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 * Edited by Sophia Qiu & Jason Wu 11.14.2017
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius= radius;
		
	}

	@Override
	public double calculateArea() {
		// Equation to calculate Area
		return pi*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		// Equation to calculate Perimeter
		return 2*pi*radius;
	}

	@Override
	public String toString() {
		// Returns the words that will be printed
		return " Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimter: " + this.calculatePerimeter();
	}
}
