
/*
    check whether the string is palindrome or not
 */

package Easyprb;
import java.util.Scanner;

public class Is_String_Palindrome_Imp {
    public static boolean isPalindrome(String str) {

        // define two pointers
        int start = 0, end = str.length()-1;

//        compare start and end characters
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a string to check the palindrome: ");
        String str = sc.nextLine();

        // check if the input string is palindrome

        if (isPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
