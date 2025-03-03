/*Author: Aravind Santha
 * Description: Simple banking application driver
 * Date: Jan 21, 2024
 * */

//This will import the Scanner 
import java.util.Scanner;
//This driver class helps running the banking application for the students
public class DriverForBankingApplication {

	//This is the starting of the program
	public static void main(String[] args) {
		//instantiating the scanner class
		Scanner keyboard = new Scanner(System.in);


		//local variables
		//intializing name to an empty string to prevent the compiler throwing error
		String name;
		double balance;
		//for account number in banks, its should be associated with string for validation and to be used by matches for while loop
		String number = null;
		double initialbalance = 0.0;
		int choice;

		System.out.println(" Dear Student, please enter your name: ");
		name = keyboard.next();

		//initialises the boolean variable to false
		boolean valid = false;
		//while loop keeps running as long as the valid is false, this will prompt the user to enter correct number
		while (!valid) {
			System.out.println("Dear Student, please enter your 8 digit bank account number: ");
			number = keyboard.next();

			//if the input is 8 digits, the loop will exit
			if (number.matches("\\d{8}")) {
				valid = true;
			} else {
				System.out.println("Invalid input. Please enter 8 digits");
			}
		}
		System.out.println("Welcome," + name + ". Your Bank Account number is:" + number);
		keyboard.nextLine();

		//instantiating the StudentBank class
		StudentBank studentBank = new StudentBank();
		while (true) {
			System.out.println("Do you want to add money, withdraw money or check balance? ");
			System.out.println("1. Add money");
			System.out.println("2. withdraw money");
			System.out.println("3. check balance");
			System.out.println("4. Exit");

			//This will read an integer input from user and adds it to the variable choice
			choice = keyboard.nextInt();
			/*Switch case was used here to handle user choices. 
			This code is easier for me to understand compared to if else if at all i use them here`*/
			switch(choice) {
			case 1:
				System.out.println("Enter the amount to add $: ");
				double addAmount = keyboard.nextDouble();
				studentBank.addMoney(addAmount);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw $: ");
				double withdrawAmount = keyboard.nextDouble();
				studentBank.withdrawMoney(withdrawAmount);
				break;
			case 3:
				studentBank.checkbalance();
				break;

			case 4:
				System.out.println(" Thank for for banking with us, " + name );
				keyboard.close();
				return;
			case 5:
				System.out.println("Invalid entry, choose 1, 2, 3 or 4");
			}


		}

	}
}

