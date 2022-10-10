package string_problems;

import java.util.Arrays;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        isPalindrome("Mom");

    }
    // Implement here
    public static boolean isPalindrome (String str){

        char[] charArray = str.toLowerCase().toCharArray();
        char[] copyOfcharArray = Arrays.copyOf(charArray, charArray.length);
        int length = charArray.length;
        for (int i =0; i < length / 2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[length - i -1];
            charArray[length - i -1] = temp;


        }
        if (Arrays.equals(charArray,copyOfcharArray)){
            System.out.println("The word is Palindrome");
              return true;
        }else {
            System.out.println("The word is not Palindrome");
            return false;
        }
    }

}
