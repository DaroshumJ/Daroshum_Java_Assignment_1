/* chapter 5
 Write an application that calculates the product 
of the odd integers from 1 to 15.
 */

 public class ex512 {
    public static void main(String[] args) {
        // Initialize the product variable to hold the result
        int product = 1;

        // Iterate through odd integers from 1 to 15 and calculate the product
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        // Print the product of odd integers from 1 to 15
        System.out.println("The product of the odd integers from 1 to 15 is: " + product);
    }
}
