import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 *  @author Aigerim Alykulova1
 */

 public class RandomsInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // variables to store user input
        int min = 0;
        int max = 0;
        String fileName = "";

        // loop to get minimum value as a positive integer from user
        while (true) {
            try {
                System.out.print("Enter the minimum value as a positive integer: ");
                min = Integer.parseInt(scanner.nextLine());
                if (min <= 0) { // check if entered value is positive
                    System.out.println("Input ERROR. Number entered was not positive.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) { // catch exception if input is not an integer
                System.out.println("Input ERROR. Number entered was not an integer.");
            }
        }

        // loop to get maximum value as a positive integer from user
        while (true) {
            try {
                System.out.print("Enter the maximum value as a positive integer: ");
                max = Integer.parseInt(scanner.nextLine());
                if (max <= 0) { // check if entered value is positive
                    System.out.println("Input ERROR. Number entered was not positive.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) { // catch exception if input is not an integer
                System.out.println("Input ERROR. Number entered was not an integer.");
            }
        }

        // swap numbers if user enters minimum value greater than maximum value
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        // get file name from user
        System.out.print("Enter the filename to write into: ");
        fileName = scanner.nextLine();

        // create or overwrite file with given name
        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (int i = 0; i < 100; i++) {
                int randomNum = random.nextInt(max - min + 1) + min;
                writer.println(randomNum);
            }
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}