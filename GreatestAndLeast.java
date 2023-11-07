import java.util.Scanner;
/**
* @author Aigerim Alykulova
*/
public class GreatestAndLeast {
    public static void main(String[] args) {
    // write your code here
   
    Scanner input = new Scanner(System.in);
    // Declare variables to store the input , the largest number, and  the smallest number  
    int num, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
    // vatiable to check if the number entered fist time
    boolean firstNum = true;
    
    // Promt the user to enter a possitiv integer number and ask them to enter -99 to
    System.out.println("Enter a positive integer number. Enter -99 to stop input.");
    //Use a while loop to continously get input from the user 
    while (true) {
        num = input.nextInt();
        // Check if the user entered -99 to stop input 
        if (num == -99) {
            //exit the loop if thhe user entered -99
            break;
        } else if (num < 0 && num != -99) {
            // if user enetered negative number other than -99
            // Print an error message
            System.out.println("ERROR: negative integers other than -99 are not allowed.");
        } else {
            if (firstNum) {
                // if first number entered
                largest = num;
                smallest = num;
                firstNum = false;
            } else {
                if (num > largest) {
                    // if new number is larger than existing largest number
                    // update largest number
                    largest = num;
                }
                if (num < smallest) {
                     // if new number is smaller than existing smallest number
                     // update smallest number
                    smallest = num;
                }
            }
        }
    }
    // check if no numbers were entered
    if (firstNum) {
        System.out.println("No numbers were entered.");
    } else {
        // Print the largest and smallest numbers
        System.out.println("The largest number: " + largest + " ; the smallest number: " + smallest);
    }
        
    }
}
