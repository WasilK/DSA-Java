package DividenConquer;

public class DnC1 {

    /*
     * MERGE SORT ALGORITHM
     *
     * Idea:
     * Merge Sort follows the Divide and Conquer technique.
     *
     * Step 1: Divide
     * Keep dividing the array into two halves until each subarray
     * contains only one element.
     *
     * Step 2: Conquer
     * A single-element array is already sorted.
     *
     * Step 3: Merge
     * Merge the sorted halves by comparing elements one by one.
     *
     * Example:
     *
     * Original:
     * [6,3,9,5,2,8]
     *
     * Divide:
     *
     *               [6 3 9 5 2 8]
     *              /             \
     *         [6 3 9]          [5 2 8]
     *         /    \           /     \
     *      [6 3]   [9]      [5 2]    [8]
     *      /   \             /   \
     *    [6]  [3]         [5]   [2]
     *
     * Merge:
     *
     * [6] + [3] -> [3,6]
     * [3,6] + [9] -> [3,6,9]
     *
     * [5] + [2] -> [2,5]
     * [2,5] + [8] -> [2,5,8]
     *
     * [3,6,9] + [2,5,8]
     * ->
     * [2,3,5,6,8,9]
     *
     * Time Complexity:
     * Best Case    : O(n log n)
     * Average Case : O(n log n)
     * Worst Case   : O(n log n)
     *
     * Space Complexity:
     * O(n) (Extra temporary array)
     *
     * Stable Sort: Yes
     */

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int si, int ei) {

        /*
         * Base Case:
         * If the subarray contains only one element,
         * it is already sorted.
         */
        if (si >= ei) {
            return;
        }

        /*
         * Find the middle element.
         * This formula avoids integer overflow.
         */
        int mid = si + (ei - si) / 2;

        /*
         * Divide the left half.
         */
        mergeSort(arr, si, mid);

        /*
         * Divide the right half.
         */
        mergeSort(arr, mid + 1, ei);

        /*
         * After both halves become sorted,
         * merge them into one sorted array.
         */
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        /*
         * i -> points to left subarray
         * j -> points to right subarray
         * k -> points to temporary array
         */

        int i = si;
        int j = mid + 1;
        int k = 0;

        /*
         * Temporary array stores the merged result.
         */
        int temp[] = new int[ei - si + 1];

        /*
         * Compare both subarrays.
         * Copy the smaller element into temp.
         */
        while (i <= mid && j <= ei) {

            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }

            k++;
        }

        /*
         * If elements remain in the left subarray,
         * copy them.
         */
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        /*
         * If elements remain in the right subarray,
         * copy them.
         */
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        /*
         * Copy the sorted temporary array
         * back into the original array.
         */
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        printArray(arr);
    }
}