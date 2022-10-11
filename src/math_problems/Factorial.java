package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        factorial(5);
        System.out.println("factorial is :" + factorialWithRecursion(5));


    }

    static void factorial(int num) {
        int total = 1;
        for (int i = num; i >= 1; i--) {
            total *= i;
        }
        System.out.println(total);

    }
    public static int factorialWithRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {

            int Y=n * factorialWithRecursion(n - 1);

            return Y;
        }

    }
}
