/* chapter 4
Write an application that prompts the user to enter the size of 
the side of a square, then displays a hollow square of that size made of 
asterisks. Your program should work for squares of all side lengths between 1 and 20.
*/

import java.util.Scanner;

public class ex430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the side of the square (1-20): ");
        int size = input.nextInt();

        if (size < 1 || size > 20) {
            System.out.println("Invalid size. Please enter a size between 1 and 20.");
        } else {
            // Display the hollow square
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (i == 1 || i == size || j == 1 || j == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}