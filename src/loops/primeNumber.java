package loops;
import java.util.*;

public class primeNumber {
    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        if(n == 2){
//            System.out.println(n + " is a prime number.");
//        }else{
//            for(int i = 2; i <= Math.sqrt(n); i++){
//                if(n % i == 0) isPrime = false;
//            }
//            if(isPrime == true){
//                System.out.println(n + " is a prime number.");
//            }else{
//                System.out.println(n + " is not a prime number.");
//            }
//        }
        System.out.println(checkPrime(43));
    }
}
