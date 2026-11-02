package DividenConquer;

public class DnC2 {

    /*
     * QUICK SORT ALGORITHM
     *
     * Idea:
     * Quick Sort also follows the Divide and Conquer technique.
     *
     * Step 1:
     * Choose one element as the Pivot.
     * (Here we choose the last element.)
     *
     * Step 2:
     * Rearrange the array so that
     * - Elements smaller than or equal to the pivot are on the left.
     * - Elements greater than the pivot are on the right.
     * This process is called Partitioning.
     *
     * Step 3:
     * The pivot is now at its correct sorted position.
     *
     * Step 4:
     * Recursively apply Quick Sort on the left and right subarrays.
     *
     *
     * Example:
     *
     * Original:
     * [6,3,9,8,2,5]
     *
     * Pivot = 5
     *
     * After Partition:
     * [3,2,5,8,6,9]
     *       ^
     *     Pivot
     *
     * Left Part : [3,2]
     * Right Part: [8,6,9]
     *
     * Sort Left:
     * [2,3]
     *
     * Sort Right:
     * [6,8,9]
     *
     * Final:
     * [2,3,5,6,8,9]
     *
     * Time Complexity:
     * Best Case    : O(n log n)
     * Average Case : O(n log n)
     * Worst Case   : O(n²)
     * (Occurs when pivot is always the smallest or largest element.)
     *
     * Space Complexity:
     * O(log n) (Recursion Stack)
     *
     * Stable Sort: No
     * In-place Sort: Yes
     */

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {

        /*
         * Base Case:
         * If the subarray has one or zero elements,
         * it is already sorted.
         */
        if (si >= ei) {
            return;
        }

        /*
         * Partition the array.
         * Pivot reaches its correct position.
         */
        int pIdx = partition(arr, si, ei);

        /*
         * Sort elements before the pivot.
         */
        quickSort(arr, si, pIdx - 1);

        /*
         * Sort elements after the pivot.
         */
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {

        /*
         * Choose the last element as Pivot.
         */
        int pivot = arr[ei];

        /*
         * i keeps track of the last position
         * where an element <= pivot is placed.
         *
         * Initially, no such element exists.
         */
        int i = si - 1;

        /*
         * Traverse the array except the pivot.
         */
        for (int j = si; j < ei; j++) {

            /*
             * If current element belongs
             * to the left side of the pivot,
             * increase i and swap.
             */
            if (arr[j] <= pivot) {

                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        /*
         * Place the pivot after the last
         * smaller element.
         *
         * Now the pivot is at its correct
         * sorted position.
         */
        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        // Note:
       // We update arr[i], not the pivot variable.
        // 'pivot' is only a copy of arr[ei], while arr[] is the actual array.

        return i;
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 8, 2, 5};

        quickSort(arr, 0, arr.length - 1);

        printArray(arr);
    }
}