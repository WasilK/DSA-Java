package Recursion;

public class Recursion2 {
    public static int printFact(int n){ //T.C. = O(n) // S.C. = O(n)
        if(n == 1 || n == 0){
            return 1;
        }
        return n * printFact(n - 1);
    }

    public static int printSum(int n){
        int sum = 0;
        if(n == 1){
            return 1;
        }
        sum += n + printSum(n- 1);
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println(printFact(5));
        System.out.println(printSum(5));
    }
}
