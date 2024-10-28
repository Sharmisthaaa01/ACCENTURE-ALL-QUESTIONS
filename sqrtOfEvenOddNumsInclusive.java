
/*
    calculate and return the diff between the sum of sqrts of even nums and the sum of
    sqrts of odd nums in the range from m to n (inclusive).

 */

package Easyprb;
import java.util.Scanner;

import java.util.Scanner;

public class sqrtOfEvenOddNumsInclusive {

    // Function to calculate the difference between sums of square roots of even and odd numbers
    public static double calculateSqrtDifference(int m, int n) {
        double evenSum = 0;  // Sum of square roots of even numbers
        double oddSum = 0;   // Sum of square roots of odd numbers

        // Loop through numbers from m to n
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += Math.sqrt(i);  // Add the sqrt of even number
            } else {
                oddSum += Math.sqrt(i);   // Add the sqrt of odd number
            }
        }

        // Return the difference between the two sums
        return evenSum - oddSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range from user
        System.out.println("Enter the starting value of the range (m): ");
        int m = sc.nextInt();

        System.out.println("Enter the ending value of the range (n): ");
        int n = sc.nextInt();

        // Call the function to calculate the difference
        double result = calculateSqrtDifference(m, n);

        // Output the result
        System.out.println("The difference between the sum of square roots of even and odd numbers is: " + result);
    }
}
