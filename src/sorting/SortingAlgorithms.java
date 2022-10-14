package sorting;

public class SortingAlgorithms {


    /**
     * INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     * <p>
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     * in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;

        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] bubbleSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();
        int i, j, temp;
        boolean swapped = false;

        int n = array.length;
        ;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // we swap the two values
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;

                }
            }
            if (swapped == false) break;
            ;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int[] mergeSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();

        // first we need to split the array into left side and right side and use recursion until it's self ordered(one element array)
        int length = array.length;

        if (length < 2) {
            return array;
        }
        int midIndex = length / 2;
        int[] leftSide = new int[midIndex];
        int[] rightSide = new int[length - midIndex];
        // copying elements from original array
        for (int i = 0; i < midIndex; i++) {
            leftSide[i] = array[i];
        }
        for (int i = midIndex; i < length; i++) {

            rightSide[i - midIndex] = array[i];
        }

        // we need to call it recursively
        mergeSort(leftSide);
        mergeSort(rightSide);

        //

        // created a merge method below
        merge(array, leftSide, rightSide);
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    private static void merge(int[] array, int[] leftSide, int[] rightSide) {
        int length = array.length;
        int leftSize = leftSide.length;
        int rightSize = rightSide.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftSide[i] <= rightSide[j]) {
                array[k] = leftSide[i];
                i++;
            } else {
                array[k] = rightSide[j];
                j++;
            }
            k++;

        }
        while (i < leftSize) {
            array[k] = leftSide[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightSide[j];
            j++;
            k++;
        }
    }

    public int[] quickSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();
        // check the method below quicksort
        quickSort(array, 0 , array.length - 1);

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int [] quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return array;
        }
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

        quickSort(array, low, ePointer);
        quickSort(array, sPointer, high);
        return  array;
    }

    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();


        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int[] bucketSort(int[] array) {
        //implement here
        final long startTime = System.currentTimeMillis();


        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }

    public int[] shellSort(int[] array) {
        //implement here
        final long startTime = System.currentTimeMillis();


        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return array;
    }
}
