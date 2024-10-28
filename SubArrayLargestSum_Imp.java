
/*
  Given an integer array nums, find the subarray with largest sum and return its sum.

  Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
  Output: 6
 */

package Easyprb;
import java.util.*;
public class SubArrayLargestSum_Imp {

//    function describe
    public static int MaxSubArray (int [] numbers) {
        int sum = 0; // initializing with zero
        int max = Integer.MIN_VALUE; // Initializing max with the smallest possible value


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add the current number to the sum
            max = Math.max(max, sum); // Update max if the current sum is greater

            // If the current sum becomes negative, reset it to zero
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the largest sum is: " + MaxSubArray(arr));
    }
}
