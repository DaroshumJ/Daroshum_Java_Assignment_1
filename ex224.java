 /* chapter 2 
 (Largest and Smallest Integers) Write an application that reads five integers 
 and determines and prints the largest and smallest integers in the group. 
 Use only the programming techniques you learned in this chapter. 
 */ 

 import java.util.Scanner;

 public class ex224 {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
 
         System.out.println("Enter five integers:");
 
         int largest = Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;
 
         for (int i = 0; i < 5; i++) {
             int number = input.nextInt();
 
             if (number > largest) {
                 largest = number;
             }
 
             if (number < smallest) {
                 smallest = number;
             }
         }
 
         System.out.println("Largest integer: " + largest);
         System.out.println("Smallest integer: " + smallest);
 
         input.close();
     }
 }
 
 
 
 
