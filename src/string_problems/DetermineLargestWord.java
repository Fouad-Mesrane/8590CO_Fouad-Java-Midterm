package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /**
     * INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        System.out.println(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        int key = st.length();


        // Implement here
        // using split method we split the string and store it in array
        String[] arr = wordGiven.split(" ");

        // we loop through the array and check for the longest word and reassign it to String st
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() >= st.length()) {
                st = arr[i];
            }
        }
        // store it in map and return map.
        map.put(key, st);

        return map;
    }
}
