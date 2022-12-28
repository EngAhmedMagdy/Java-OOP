package play;

import java.util.Scanner;

public class AppCalculator {
	static Scanner input = new Scanner(System.in);
	public static double readNumber () {
		System.out.println("Enter a Number: ");
		double num = input.nextDouble();
		return num;
	}
	public static int readOperation () {
		System.out.println("Enter from 0-4 \n 1) + \n 2) - \n 3) * \n 4) / \n 0) Exit program");
		int operator = input.nextInt();
		return operator;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		while(true)
		{
			int operator = readOperation();
			if(operator == 5) break;
			double firstNum = readNumber();
			double secondNum = readNumber();
			c.makeCalculation(firstNum, secondNum,operator);
			System.out.println( "result:"+ c.getResult() );
		}

	}

}
