package math_problems;

import java.util.Arrays;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};
        int lowestNum = 0 ;
        for (int i = 0; i <array.length ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // sorting an array by swapping values
                if (array[i] > array[j]){
                    lowestNum = array[i];
                    array[i] = array[j];
                    array[j] = lowestNum;

                }
            }
            
           }
        System.out.println(array[0]);
       // lowestNumber(array);
        }

        // or we can use Arrays.sort and print the index at 0
    /*static void lowestNumber (int[] arr){
        Arrays.sort(arr);
        System.out.println(arr[0]);

    }*/

    }


