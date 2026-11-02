package Arrays;

public class Arrays3 {
    public static int[] ReverseArray(int arr[]){
        int start = 0, last = arr.length - 1;
        while(start < last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;
        }
        return arr;
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ReverseArray(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
