
/*
      The fn accepts a string "str" as its argument. the fn needs to return the transformed string by
       replacing all occurences of the character "a"
        with the character "b" and vce-versa.

        input: abaabbcc
 */

package Easyprb;
import java.util.*;

public class ReplaceAllOccurences_Imp {
    public static String replaceAllOccurences(String str) {

        // Convert the input string to a char array to modify it
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b'; // replace 'a' with 'b'
            } else if (chars[i] == 'b') {
                chars[i] = 'a'; // replace 'b' with 'a'
            }
        }
        return new String(chars); // the new modified string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string");
        String str = sc.nextLine();


        System.out.println("the string after replacing occurrences: " + replaceAllOccurences(str));

    }
}
