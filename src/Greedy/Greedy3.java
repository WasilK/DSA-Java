package Greedy;

import java.util.Arrays;

public class Greedy3 {
    public static int minAbsDiff(int A[], int B[]){
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for(int i = 0; i < A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int A[] = {1, 2 ,3};
        int B[] = {2, 1, 3};
        System.out.println(minAbsDiff(A, B));
    }
}
