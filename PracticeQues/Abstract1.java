import java.util.Scanner;
abstract class Shape {
	// write your code here...
	
	abstract double calculateArea();
	abstract double calculatePerimeter();
	
	
}
class Rectangle extends Shape {
    double length;
    double width;

    @Override
    double calculateArea() {
    	// write your code here..
    	return length*width;
    	
    	
    }

    @Override
    double calculatePerimeter() {
    	// write your code here...
    	return 2*(length+width);
    }
    
    void displayDetails()
    {
    	System.out.println("Shape details:");
    	System.out.println("Area: " + calculateArea());
    	System.out.println("Perimeter: " + calculatePerimeter());
    
    }
    void inputDetails(Scanner scanner) {
    	System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
    }
}

class Circle extends Shape {
    double radius;

    @Override
    double calculateArea() {
    	return Math.PI*radius*radius;
    	
    	
    }

    @Override
    double calculatePerimeter() {
    	return 2*Math.PI*radius;
    }
    
    void displayDetails()
    {
    	System.out.println("Shape details:");
    	System.out.println("Area: " + calculateArea());
    	System.out.println("Perimeter: " + calculatePerimeter());
    	
    }
    void inputDetails(Scanner scanner) {
    	System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.inputDetails(scanner);
        rectangle.displayDetails();
        Circle circle = new Circle();
        circle.inputDetails(scanner);
        circle.displayDetails();
        scanner.close();
    }
}