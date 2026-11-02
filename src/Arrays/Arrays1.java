package Arrays;

import java.util.Arrays;

public class Arrays1 {
    public static int LinearSearch(int arr [], int num){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static int printLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2};
//        System.out.println(LinearSearch(arr, 7));
        System.out.println(printLargest(arr));
    }
}
