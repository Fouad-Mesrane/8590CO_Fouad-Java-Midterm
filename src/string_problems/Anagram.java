package string_problems;

import java.util.Arrays;

public class Anagram {

    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */

    // Implement Here
    public static boolean isAnagram(String str1, String str2) {
        // first we need to extract data from string to a char array
        char arr1[] = str1.toLowerCase().toCharArray();
        char arr2[] = str2.toLowerCase().toCharArray();

        // we need to sort the 2 char arrays

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // check if both arrays are equal and return true if they are equal

        boolean result = Arrays.equals(arr1, arr2);

        if (result == true) {

            System.out.println("Strings are Anagrams");
            return true;
        } else {
            System.out.println("Strings are not Anagrams");
            return false;
        }



    }

}
