
/*
    find missing number in an array, given an arr containing numbers n, distinct numbers in the range  [0,n].
    return the only number in the range that is missing from the array.

    i/p -> nms = [3,0,1]
    o/p -> 2
 */
package Easyprb;

import java.util.Scanner;
public class missingNumInArray {

    // Function to find the missing number in the array
    public static int findMissingNum(int[] numbers) {
        int n = numbers.length; // 'n' is the length of the array
        int sum = 0;

        // Calculate the expected total sum of numbers from 0 to n
        int total = n * (n + 1) / 2;

        // Sum the elements of the input array
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        // The missing number is the difference between the expected sum and the actual sum
        return total - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array (n+1 elements expected)
        System.out.println("Enter the size of the array (should be n+1): ");
        int n = sc.nextInt();

        // Create an array with 'n' elements
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function to find the missing number and print the result
        System.out.println("The missing number is: " + findMissingNum(arr));
    }
}
