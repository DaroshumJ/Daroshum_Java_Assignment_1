/* chapter 4 
 Write an application that reads three nonzero values entered by the 
 user and determines and prints whether they could represent the sides of a triangle. 
 */

 import java.util.Scanner;

 public class ex436 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.println("Enter three nonzero values:");
         System.out.print("Value 1: ");
         double side1 = input.nextDouble();
 
         System.out.print("Value 2: ");
         double side2 = input.nextDouble();
 
         System.out.print("Value 3: ");
         double side3 = input.nextDouble();
 
         // Check if the values can form a triangle
         boolean isTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
 
         // Printing the result
         if (isTriangle) {
             System.out.println("These values can represent the sides of a triangle.");
         } else {
             System.out.println("These values cannot represent the sides of a triangle.");
         }
 
         input.close();
     }
 }
 