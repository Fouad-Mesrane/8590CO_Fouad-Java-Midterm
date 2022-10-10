package string_problems;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        int count ;
        // we split the
        String [] arrOfWords = st.toLowerCase().split(" ");

        for (int i = 0; i < arrOfWords.length; i++){
            count = 1;
            for (int j = i +1; j < arrOfWords.length; j++){
                if (arrOfWords[i].equals(arrOfWords[j])){
                    count++;
                    arrOfWords[j] = "0";
                }
            }
            if (!arrOfWords[i].equals("0") && count > 1){
                System.out.print(" \n"+arrOfWords[i]+" : " + count + " times" );
            }
        }

        // average length of all the words
        System.out.println("\nthe average length of all the words is : " + averageWordsLength(st));



    }
//average length of all the words
    public static int averageWordsLength(String str){
        int length ;
        // first we need to split the sentence into array of words
        String []  splitSentence = str.split(" ");

        // we remove spaces and dots from the string
        String stWithoutSpace = str.replace(" ", "");
        String stWithoutSpaceAndDots = stWithoutSpace.replace(".", "");

        //we store the number of words we have
        int numWords = splitSentence.length;

        //calculate the average

        length = stWithoutSpaceAndDots.length() / numWords;

        return length;
    }



}
