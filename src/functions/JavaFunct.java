package functions;
import java.util.*;

public class JavaFunct {
    public static int calcProduct(int a, int b){
        return a * b;
    }
    public static int printFact(int n){
        int f =  1;
        for(int i = 1;i <= n; i++){
            f =f * i;
        }
        return f;
    }
    public static int calcbinCoeff(int n, int r){
        int n_fact = printFact(n);
        int r_fact = printFact(r);
        int nmr_fact = printFact(n-r);
        int ans = n_fact/(r_fact*nmr_fact);
        return ans;
    }

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static int binToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while(binNum > 0){
            int ld = binNum % 10;
            dec = dec + (ld * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        return dec;
    }

    public static int decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n > 0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        return binNum;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int product = calcProduct(23, 2);
//        System.out.println(product);
//        System.out.println(printFact(5));
//        System.out.println(calcbinCoeff(5,2));
//        checkPrime(5);
//        primesInRange(10);
//        System.out.println(binToDecimal(1001));
        System.out.println(decToBin(5));

    }
}
//