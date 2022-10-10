package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {
        permutation("abb");

    }
    // Implement Here
    public static void permutation(String str){
       permutation("", str);

    }
    public static void permutation(String prefix, String str){
        if (str.length() == 0){
            System.out.println(prefix);
            return;
        }else {
            for (int i = 0; i < str.length(); i++) {
              permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i + 1, str.length()));
            }

        }

    }

}
