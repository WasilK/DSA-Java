package Arrays;

import java.util.Arrays;

public class Arrays8 {
    public static boolean checkTwice(int arr[]){
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static int searchRotatedSorted(int arr[], int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            } else{
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }



    public static int elevatedRain(int height[]){
        int n = height.length;
        int trappedWater = 0;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
         int arr[] = {5,4,3,2,1};
//        System.out.println(checkTwice(arr));
        System.out.println(searchRotatedSorted(arr, 2));
//        System.out.println(elevatedRain(arr));
    }
}
