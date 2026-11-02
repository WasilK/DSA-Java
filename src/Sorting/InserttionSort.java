package Sorting;

public class InserttionSort {

    /*
     * INSERTION SORT ALGORITHM
     *
     * Idea:
     * Assume the first element is already sorted.
     * Then, one by one, pick each remaining element
     * and insert it into its correct position in the
     * already sorted left part of the array.
     *
     * Example:
     * [5,4,1,3,2]
     *
     * Pass 1:
     * Pick 4
     * Shift 5 to the right
     * Insert 4
     * Result -> [4,5,1,3,2]
     *
     * Pass 2:
     * Pick 1
     * Shift 5, Shift 4
     * Insert 1
     * Result -> [1,4,5,3,2]
     *
     * Pass 3:
     * Pick 3
     * Shift 5, Shift 4
     * Insert 3
     * Result -> [1,3,4,5,2]
     *
     * Pass 4:
     * Pick 2
     * Shift 5, Shift 4, Shift 3
     * Insert 2
     * Result -> [1,2,3,4,5]
     *
     * Time Complexity:
     * Best Case  : O(n)   (Already sorted)
     * Average    : O(n²)
     * Worst Case : O(n²)  (Reverse sorted)
     *
     * Space Complexity:
     * O(1)
     *
     * Stable Sort: Yes
     */

    public static int[] insertionSort(int arr[]) {

        // Start from index 1 because index 0 is considered sorted.
        for (int i = 1; i < arr.length; i++) {

            // Current element that we want to insert
            int curr = arr[i];

            // Last index of the sorted portion
            int prev = i - 1;

            /*
             * Move all elements greater than curr
             * one position to the right.
             *
             * This creates the correct position
             * where curr will be inserted.
             */
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            /*
             * prev stopped because either:
             * 1. prev became -1 (curr is the smallest element)
             * OR
             * 2. arr[prev] <= curr
             *
             * So insert curr at prev + 1.
             */
            arr[prev + 1] = curr;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}