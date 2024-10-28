
/*
   given two strings, s and t. return true if t is an anagram of s, and false otherwise

   AN anagram is a word or phrase formed by rearranging the letters of a different word
   or phrase, typically using all the original letters exactly once.

   input -> s = "anagram", t = "nagaram"
   output -> true
 */

package Easyprb;

import java.util.Scanner;

public class IsAnagram_Imp {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; // considering the freq of each alphabet from a-z
        for (int i = 0; i< s.length(); i++) {
            count[s.charAt(i) - 'a']++; // for increment
            count[t.charAt(i) - 'a']--; // for decrement
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the s value: ");
        String s = sc.nextLine();

        System.out.println("Write the t value: ");
        String t = sc.nextLine();

            System.out.println(isAnagram(s, t));
    }
}
