package Recursion;

public class Recursion1 {
    public static void printNumDecreasing(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNumDecreasing(n - 1);
    }

    public static void printNumIncreasing(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printNumIncreasing(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
//        printNumDecreasing(10);
        printNumIncreasing(15);
    }
}
