package play;

import java.util.Scanner;

public class AppAccount {
	static Scanner input = new Scanner(System.in);
	public static double readNumber () {
		System.out.println("Enter deposit amount:");
		double num = input.nextDouble();
		return num;
	}
	public static int readOperation () {
		System.out.println("Enter from 0-3 \n 1) show balance \n 2) deposit \n 3) withdraw \n 0) Exit program");
		int operator = input.nextInt();
		return operator;
	}
	public static void main(String[] args) {
		Account account = new Account( 50.00 ); // create Account object 
		while(true)
		{
			int operator = readOperation ();
			if(operator == 0) break;
			else if(operator == 1) {
				System.out.println( "account balance:"+account.getBalance() );
			}
			else if(operator == 2) {
				double amount = readNumber();
				account.credit(amount);
			}
			else if(operator == 3) {
				double amount = readNumber();
				account.withdraw(amount);
			}
		}
		
	}

}
