package math_problems;

public class Fibonacci {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {

        fibonnaci(40);

    }

    static void fibonnaci(int num) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is num
        while (counter < num) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

}
