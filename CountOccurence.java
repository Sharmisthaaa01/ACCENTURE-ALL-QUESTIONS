
/*
      Count the occurence of an given element in an array-
      int [] arr = {5,4,1,4,2}
      int target_element = 2
 */

package Easyprb;
import java.util.*;
public class CountOccurence {

    public static int countOccurence(int [] arr, int Find_Element) {
        int count = 0; // initializing thr counter with 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Find_Element) {
                count++; // the value will be updated here
            }
        }
        return count;
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

        System.out.println("Enter the element to be searched: ");
        int Find_Element = sc.nextInt();

        // call the function
        System.out.println(countOccurence(arr, Find_Element));
    }
}
