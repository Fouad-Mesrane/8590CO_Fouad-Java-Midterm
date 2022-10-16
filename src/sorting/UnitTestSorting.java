package sorting;

import org.testng.Assert;

public class UnitTestSorting {

    /**
     * This class is used to help with unit testing of sorting algorithms from the Sort class
     */

    public static void main(String[] args) {
        // You will use these arrays to validate whether your sorting algorithm functions as expected
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class
        SortingAlgorithms sorting = new SortingAlgorithms();

        // Pass the unsorted array to selectionSort() method (or any method you want to unit test) from Sort class
        // unSortedArray = sorting.selectionSort(unSortedArray);
        // unSortedArray = sorting.insertionSort(unSortedArray);
        // unSortedArray = sorting.bubbleSort(unSortedArray);
        // unSortedArray = sorting.mergeSort(unSortedArray);
        // unSortedArray = sorting.quickSort(unSortedArray);
        //  unSortedArray = sorting.heapSort(unSortedArray);
            unSortedArray = sorting.bucketSort(unSortedArray, unSortedArray.length);

        // Verify if the unsorted array is sorted by the desired method
        // Assert.assertEquals(unSortedArray, sortedArray, "ARRAY IS NOT SORTED... YET!");


        for (int i = 0; i < unSortedArray.length; i++) {
            System.out.println(unSortedArray[i]);

        }


    }

    private static int[] sort(int[] array, int low, int high) {
        if (low >= high) return array;

        int sPointer = low, ePointer = high, m = sPointer + (ePointer - sPointer) / 2, pivot = array[m];

        while (sPointer <= ePointer) {

            while (array[sPointer] < pivot) {
                sPointer++;
            }
            while (array[ePointer] > pivot) {
                ePointer--;
            }
            if (sPointer <= ePointer) {
                int temp = array[sPointer];
                array[sPointer] = array[ePointer];
                array[ePointer] = temp;
                sPointer++;
                ePointer--;
            }
        }

        sort(array, low, ePointer);
        sort(array, sPointer, high);
        return array;
    }

    private static int[] sort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;

    }

}


