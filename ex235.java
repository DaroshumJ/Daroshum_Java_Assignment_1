/* chapter 2
 * (Car-Pool Savings Calculator) Research several car-pooling websites. 
 * Create an application that calculates your daily driving cost, 
 * so that you can estimate how much money could be saved by car pooling, 
 * which also has other advantages such as reducing carbon emissions and 
 * reducing traffic congestion. The application should input the following 
 * information and display the user’s cost per day of driving to work:

Total miles driven per day.

Cost per gallon of gasoline.

Average miles per gallon.

Parking fees per day.

Tolls per day.
 */


 import java.util.Scanner;

public class ex235 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the required information
        System.out.print("Enter total miles driven per day: ");
        double totalMilesDrivenPerDay = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double averageMilesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFeesPerDay = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();

        // Calculate the daily driving cost
        double gallonsUsedPerDay = totalMilesDrivenPerDay / averageMilesPerGallon;
        double dailyGasCost = gallonsUsedPerDay * costPerGallon;
        double totalDailyCost = dailyGasCost + parkingFeesPerDay + tollsPerDay;

        System.out.printf("Your daily driving cost is: $%.2f%n", totalDailyCost);

        // Close the scanner to prevent resource leak
        input.close();
    }
}
