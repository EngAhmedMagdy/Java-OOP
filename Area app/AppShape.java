package play;

import java.util.Scanner;

public class AppShape {
	static Scanner input = new Scanner(System.in);
	public static double readNumber () {
		System.out.println("Enter a Number: ");
		double num = input.nextDouble();
		return num;
	}
	public static int readOperation () {
		System.out.println("Enter from 0-3 \n 1) Square \n 2) Rectangle \n 3) Circle ");
		int operator = input.nextInt();
		return operator;
	}
	public static void main(String[] args) {
		
		
		int operator = readOperation ();
		if(operator == 1){
			double side = readNumber();
			Square s = new Square(side);
			s.calculateArea();
			System.out.println( "area:"+ s.getArea() );
		}
		else if(operator == 2){
			double length = readNumber();
			double width = readNumber();
			Rectangle r = new Rectangle(length,width);
			r.calculateArea();
			System.out.println( "area:"+ r.getArea() );
		}
		else if(operator == 3){
			double radius = readNumber();
			Circle c = new Circle(radius);
			c.calculateArea();
			System.out.println( "area:"+ c.getArea() );
		}
	}

}
