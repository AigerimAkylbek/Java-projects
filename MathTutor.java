/**
 * 
 * @author Aigerim Alykulova
 *
 */

//Imports needed for Scanner and Random class

import java.util.Scanner;
import java.util.Random;

public class MathTutor {
	
// add function to be called later
public static void add(Scanner keyboard) {
		
		// Add random scanner to get random numbers
		Random randomAdd = new Random();
			
		// Declaring variables for the add method.  2 variables for the random numbers, 1 for the sum, 1 for the user answer
		int addOne;
		int addTwo;
		int addSum;
		int addAnswer;
		
		// Generating and storing 2 random integers from the value of 0-999
		addOne = randomAdd.nextInt(1000);
		addTwo = randomAdd.nextInt(1000);
		
		// If addOne is greater than addTwo, do the following equation.  Guarantees that the higher number is shown on top
		if(addOne >= addTwo) {
			
			// Generates questions for user, with numbers aligned to the right
			System.out.println("what is the answer to this addition problem?");
			System.out.printf("% 5d\n", addOne);
			System.out.printf("+" + "% 4d\n", addTwo);
			System.out.println("------");
			
			// Calculates the equation and stores in the variable addSum
			addSum = addOne + addTwo;
			
			// Gets user's answer
			addAnswer = keyboard.nextInt();
			
			// Output messages, tells user if the message is correct or not
			if(addAnswer == addSum)
				System.out.println("Congratulations, that is correct");
			
			else
				System.out.println("Sorry, that is the wrong answer");
				System.out.println("The correct answer is: " + addSum);
		 
		}
		
		// if addTwo is greater than addOne, execute this code
		else{
			
			// Generates question for user, with numbers aligned to the right
			System.out.println("What is the answer to this addition problem?");
			System.out.printf("% 5d\n", addTwo);
			System.out.printf("+" + "% 4d\n", addOne);
			System.out.println("------");
			
			// Calculating the equation and storing it again
			addSum = addOne + addTwo;
			
			// Gets user input
			addAnswer = keyboard.nextInt();
			
			// Output message
			if(addAnswer == addSum)
				System.out.println("Congratulations, that is correct");
			
			else {
				System.out.println("Sorry that is the wrong answer");
				System.out.println("The correct answer is: " + addSum);
			}
		}
	}

// Substitution function to be called later
public static void sub(Scanner keyboard) {

	// Random number variable
	Random randomSub = new Random();
	
	// Declaring variables.  2 for random integers, one for the sum, one for user answer
	int subOne;
	int subTwo;
	int subSum;
	int subAnswer;
	
	// Getting 2 random numbers 
	subOne = randomSub.nextInt(1000);
	subTwo = randomSub.nextInt(1000);
	
	// If-then statement.  Guarantees larger number on top
	if(subOne >= subTwo) {
		
		// Generates question for user, with output aligning to the right
		System.out.println("what is the answer to this subtraction problem?");
		System.out.printf("% 5d\n", subOne);
		System.out.printf("-" + "% 4d\n", subTwo);
		System.out.println("------");
		
		// Calculating the equation
		subSum = subOne + subTwo;
		
		// Gets user input
		subAnswer = keyboard.nextInt();
		
		// Output message
		if(subAnswer == subSum)
			System.out.println("Congratulations, that is correct");
		
		else
			System.out.println("Sorry, that is the wrong answer");
			System.out.println("The correct answer is: " + subSum);
	 
	}
	
	else{
		
		// Generates question for user
		System.out.println("What is the answer to this subtraction problem?");
		System.out.printf("% 5d\n", subTwo);
		System.out.printf("-" + "% 4d\n", subOne);
		System.out.println("------");
		
		// Calculating the equation
		subSum = subTwo - subOne;
		
		// Getting user input
		subAnswer = keyboard.nextInt();
		
		// Output message
		if(subAnswer == subSum)
			System.out.println("Congratulations, that is correct");
		
		else {
			System.out.println("Sorry that is the wrong answer");
			System.out.println("The correct answer is: " + subSum);
		}
	}
}

	// Menu function
	public static void main(String[] args) {
		
		// Creates scanner needed for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// Boolean checks is true, if false cancels the menu
		boolean go = true;
		while(go) {
			
		// Outputs menu for user
		System.out.println("Math Tutor\n"
					+ "1. Addition problem\n"
					+ "2. Subtraction problem\n"
					+ "3. Quit\n"
					+ "Enter your choice (1 - 3):");
		
		// Gets user input for menu and stores in variable choice
		int choice = keyboard.nextInt();
		
			// The switch decides where to go next after user inputs a selection in the menu
			switch(choice) {
			
			// Case 1 chooses the addition problem and calls that function
			case 1:
				add(keyboard);
				break;
			
			// Case 2 chooses the subtraction problem and calls that function
			case 2:
				sub(keyboard);
				break;
			
			// Case 3 quits the program
			case 3:
				go = false;
				System.out.println("Quitting");
				break;
			
			// Any other input outputs an error message
			default:
				System.out.println("ERROR!!! Please type a value between 1 and 3");
			}
		}
	}
}