package Assignment_1;
import java.util.*;

//Interface Shape
interface Shape {
	double calculateArea();

	double calculatePerimeter();
}

//Class Square implementing Shape interface
class Square implements Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	// Override method for area calculation
	@Override
	public double calculateArea() {
		return side * side;
	}

	// Override method for perimeter calculation
	@Override
	public double calculatePerimeter() {
		return 4 * side;
	}
}


//Class Triangle implementing Shape interface
class Triangle implements Shape {
	private double side1, side2, side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Override method for area calculation using Heron's formula
	@Override
	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// Override method for perimeter calculation
	@Override
	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}
}

//Main class to test Shape interface and its implementations
public class Que13Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Square 
		System.out.println("Enter side of a square: ");
		int square_side= sc.nextInt();
		Square square = new Square(square_side);
		System.out.println("Area of the square: " + square.calculateArea());
		System.out.println("Perimeter of the square: " + square.calculatePerimeter());

		//Triangle
		System.out.println("Enter three sides of a triangle: ");
		int side1= sc.nextInt();
		int side2= sc.nextInt();
		int side3= sc.nextInt();
		Triangle triangle = new Triangle(side1, side2, side3);
		System.out.println("Area of the triangle: " + triangle.calculateArea());
		System.out.println("Perimeter of the triangle: " + triangle.calculatePerimeter());
	}
}
