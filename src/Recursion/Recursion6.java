package Recursion;

public class Recursion6 {
    public static int printPower1(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * printPower1(x, n - 1);
    }

    public static int printPower2(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = printPower2(x, n/2);
        int halfPowSq = halfPow * halfPow;
        if(n % 2 != 0){
            return x * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        System.out.println(printPower1(2, 4));
        System.out.println(printPower2(2, 4));
    }
}
