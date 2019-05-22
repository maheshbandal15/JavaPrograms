package concepts.demo;

import java.util.Scanner;

public class DemoShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your shape");
		String shape = sc.next();

		Shape s = null;

		switch (shape) {
		case "rectangle":
			System.out.println("Enter length and breadth of rectangle: ");
			s = new Rectangle(sc.nextInt(), sc.nextInt());
			break;

		case "circle":
			System.out.println("Enter radius of circle: ");
			s = new Circle(sc.nextDouble());
			break;

		case "triangle":
			System.out.println("Enter base and height of triangle : ");
			s = new Triangle(sc.nextInt(), sc.nextInt());
			break;
		default:
			System.out.println("Invalid shape");
			break;
		}

		System.out.println("Enter your favorite color");
		String color = sc.next();

		System.out.println(s.calculateCost(color));
		
		
	}

}
