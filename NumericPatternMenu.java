import java.util.Scanner;

/**
 * @author Aigerim Alykulova
 */

 public class NumericPatternMenu {

    // Method to validate the user input as an integer
    public static int validateInt(String prompt, Scanner keyboard) {
      int num;
      while (true) {
        try {
          System.out.println(prompt);
          num = Integer.parseInt(keyboard.nextLine());
          // Check if the number is positive
          if (num < 0) {
            System.out.println("ERROR. Number entered is not positive.\n");
          } else {
            break;
          }
        } catch (Exception e) {
          System.out.println("ERROR. Number entered is not an integer.\n");
        }
      }
      return num;
    }

  // Method to generate the numeric pattern
    public static String numericPattern(int size, boolean direction) throws IllegalArgumentException {
      String str = "";
      if (direction) {
    // Generate Type I pattern
        for (int i = 1; i <= size; i++) {
          str += i;
        }
        for (int i = size - 1; i >= 1; i--) {
          str += i;
        }
      } else {
        // Generate Type II pattern
        for (int i = size; i >= 1; i--) {
          str += i;
        }
        for (int i = 2; i <= size; i++) {
          str += i;
        }
      }
      return str;
    }
  
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int choice, size;
      do {
        // Display the menu
        printMenu();
        // Get the user's choice
        choice = validateInt("Enter your choice (1 - 3):", keyboard);
  
        switch (choice) {
          case 1:
          // Get the size of the pattern and generate Type I pattern
            size = validateInt("Please enter the size of the pattern. The size must be a positive integer:", keyboard);
            System.out.println(numericPattern(size, true) + "\n");
            break;
          case 2:
          // Get the size of the pattern and generate Type II pattern
            size = validateInt("Please enter the size of the pattern. The size must be a positive integer:", keyboard);
            System.out.println(numericPattern(size, false) + "\n");
            break;
          case 3:
            break;
          default:
            System.out.println("ERROR. Number entered is not a valid selection.\n");
            break;
        }
      } while (choice != 3);
      System.out.println("Quitting!");
    }
  // Method to display the menu
    public static void printMenu() {
      System.out.print("Numeric Pattern Display\n" +
          "1. Print Type I pattern (like 12321)\n" +
          "2. Print Type II pattern (like 32123)\n" +
          "3. Quit\n");
    }
  }