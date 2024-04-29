/* chapter 4 
(Gas Mileage) Drivers are concerned with the mileage their automobiles get. 
One driver has kept track of several trips by recording the miles driven and 
gallons used for each tankful. Develop a Java application that will input the 
miles driven and gallons used (both as integers) for each trip. The program 
should calculate and display the miles per gallon obtained for each trip and 
print the combined miles per gallon obtained for all trips up to this point. 
All averaging calculations should produce floating-point results. Use class 
Scanner and sentinel-controlled iteration to obtain the data from the user. 
*/   

import java.util.Scanner;

public class ex417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();

        while (miles != -1) {
            System.out.println("Enter gallons used: ");
            int gallons = input.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            // Update total miles and total gallons
            totalMiles += miles;
            totalGallons += gallons;

            // Calculate and display combined miles per gallon up to this point
            double combinedMPG = (double) totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon up to this point: %.2f%n", combinedMPG);

            System.out.println("\nEnter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }

        System.out.println("Exiting program.");
        input.close();
    }
}
