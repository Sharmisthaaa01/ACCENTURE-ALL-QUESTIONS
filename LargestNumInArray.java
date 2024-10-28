
/*
         Find largest number in an array
 */

package Easyprb;
import java.util.Scanner;

public class LargestNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // now find out the largest number
        int max_Value = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max_Value) {
                max_Value = arr[i];
            }
        }
        System.out.println(max_Value);
    }
}
