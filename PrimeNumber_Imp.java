
/*
    Write a code for prime number

    prime number: prime number is a number that is greater than 1 and divided by 1 or itself only
 */

package Easyprb;
import java.util.*;
public class PrimeNumber_Imp {

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // if divisible not prime
            }
        }
        return true;   // if not then its prime
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

//        call the function and display result

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}


