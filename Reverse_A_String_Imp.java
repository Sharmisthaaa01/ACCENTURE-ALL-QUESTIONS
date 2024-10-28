
/*
    reverse a string. the fn accepts a string "str" as its argument. the fn needs
    to reverse the order of the words in the string.
 */

package Easyprb;
import java.util.Scanner;

public class Reverse_A_String_Imp {

    // Function to reverse the entire string
    public static String reverseString(String str) {


        // Use StringBuilder to reverse the characters in the string
        StringBuilder sb = new StringBuilder(str);

        // Reverse the characters in the string
        sb.reverse();

        // Return the reversed string
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Write a string: ");
        String input = sc.nextLine();

        // Call the function to reverse the string and print the result
        System.out.println("The reversed string is: " + reverseString(input));
    }
}

