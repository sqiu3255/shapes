/**
 * @author  Sophia Qiu & Jason Wu 11.14.2017
 * 
 */

package shapes;

public class Square extends Rectangle {

	int side; //variable(s) used

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	public double calculateArea() {
		// Equation to calculate Area
		return side*side;
	}
	
	public double calculatePerimter() {
		// Equation to calculate Perimeter
		return side*4;
	}

	@Override
	public String toString() {
		// Returns the words that will be printed
		return " Square Side: " + side + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
	}

}
