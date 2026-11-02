package Recursion;

public class Recursion5 {
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length - 1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length - 1){
            return - 1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,5};
        System.out.println(lastOccurence(arr, 5, 0));
    }
}

