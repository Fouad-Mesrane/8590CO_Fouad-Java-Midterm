package math_problems;

import java.util.Arrays;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        findMissingNumber(array);
}
    static void findMissingNumber (int[] arr){
        int missingNum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + 1 != arr[j]){
                    missingNum = arr[j] - 1;
                }
            }
        }
        System.out.println("The missing number is: "+missingNum);
    }
}
