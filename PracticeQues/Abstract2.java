import java.util.Scanner;
abstract class Shape1 {

	// write your code here
	
	abstract double calculateArea();
	
	
}

class Rectangle1 extends Shape1 {

	// write your code here
	double length;
	double width;

    @Override
    double calculateArea() {
    	
    	return this.length*this.width;
    	
    	
    }

	void displayDetails()
	{
		System.out.println("Shape details:");
		System.out.println("Area: " + calculateArea());
	}
		
    void inputDetails(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }
}

class Circle1 extends Shape1 {
	// write your code here
	
	double radius;

    @Override
    double calculateArea() {
    	
    	return Math.PI*radius*radius;
    	
    }

	void displayDetails()
	{
		System.out.println("Shape details:");
		System.out.println("Area: " + calculateArea());
	}

    void inputDetails(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
}

public class Abstract2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle1 rectangle = new Rectangle1();
        rectangle.inputDetails(scanner);
        rectangle.displayDetails();
        Circle1 circle = new Circle1();
        circle.inputDetails(scanner);
        circle.displayDetails();
        scanner.close();
    }
}