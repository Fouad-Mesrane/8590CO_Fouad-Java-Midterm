package math_problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    /**
     * INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     * Print out the prime numbers in the given range.
     * <p>
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

       /* for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;
            for (int j = 2; j <= i /2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                primeNumbers.add(i);

            }
        }
        for (int num:primeNumbers
             ) {
            System.out.println(num);
        }*/

        // better performance using the second method printPrimeNumbers()
        printPrimeNumbers(1000000);
    }

    static void printPrimeNumbers(int num) {

        boolean[] prime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            prime[i] = true;
        }

        for (int p = 2; p < Math.sqrt(num); p++) {
            if (prime[p]) {
                for (int j = 2; j * p <= num; j++) {
                    prime[j * p] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                System.out.print(i + ",");
            }
        }
    }
}
