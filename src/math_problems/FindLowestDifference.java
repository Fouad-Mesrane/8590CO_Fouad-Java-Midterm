package math_problems;

import java.util.*;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        lowestDifference(array1,array2);
    }


    static void lowestDifference(int[] array1, int[] array2) {

        // first convert to arrayList


        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        for (int a : array1
        ) {
            arrayList1.add(a);
        }
        for (int b : array2
        ) {
            arrayList2.add(b);
        }
        // make a union
        List<Integer> union = new ArrayList<>(arrayList1);
        union.addAll(arrayList2);

        // make an intersection
        List<Integer> intersection = new ArrayList<>(arrayList1);
        intersection.retainAll(arrayList2);

        // remove duplicate of intersection from union
        union.removeAll(intersection);


        // sorting the array

        Collections.sort(union);
        // get the first index
        System.out.println(union.get(0));

    }
}




