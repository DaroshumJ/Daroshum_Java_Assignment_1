/* Chapter 5
Write an application that finds the smallest of several integers. Assume that the first value read specifies the number of 
values to input from the user.
 */

 import java.util.Scanner;

public class ex511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        if (numberOfValues <= 0) {
            System.out.println("Invalid number of values. Please enter a positive integer.");
        
        }

        System.out.println("Enter the values:");

        // Read the first value as the initial smallest value
        int smallest = input.nextInt();

        // Read the remaining values and update the smallest value if necessary
        for (int i = 1; i < numberOfValues; i++) {
            int value = input.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }

        // Display the smallest value
        System.out.println("The smallest value is: " + smallest);

        input.close();
    }
}
