package Arrays;

import java.util.ArrayList;

public class Arrays5 {
//    public static void printSubarray(int arr[]){
//
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i; j < arr.length; j++){
//                int sum = 0;
//                for(int k = i; k <= j; k++){
//                    System.out.print(arr[k] + " ");
//                    sum += arr[k];
//                }
//                System.out.println();
//                System.out.println(sum);
//            }
//
//        }
//    }

    public static void printSubArray2(int arr[]){
        // more efficient code
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
             int sum = 0;
            String subarray = "";
            for(int j = i; j < arr.length; j++){
                subarray += arr[j] + " ";
                sum += arr[j];
//                System.out.println(subarray);
//                System.out.println(sum);

                if(sum > maxSum){
                    maxSum = sum;
                }

                if(sum < minSum){
                    minSum = sum;
                }

            }
            System.out.println();
        }
        System.out.println(maxSum + " " + minSum);
    }

    public static void kadanesAlgo(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        if(ms == 0){
            ms = arr[0];
            for(int i = 0; i < arr.length; i++){
                ms = Math.max(ms, arr[i]);
            }
        }
        System.out.println(ms);
    }

    public static void printSubarray3(int arr[]){
        for(int i = 0; i < arr.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = i; j < arr.length; j++){
                list.add(arr[j]);
                System.out.print(list);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {-9 };
//        printSubarray(arr);
//        printSubArray2(arr);
        kadanesAlgo(arr);
//        printSubarray3(arr);
    }
}
