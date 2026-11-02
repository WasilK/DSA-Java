package basics;

public class Practice {
    public static int printRev(int n){
        int rev = 0;
        int isNegative = (n < 0) ? -1 : 1;
        int ld = 0;
        n = Math.abs(n);
        while(n > 0){
            ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        return rev * isNegative;
    }

    public static int printSum(int n){
        int sum = 0;
        int ld = 0;
        while(n > 0){
            ld = n % 10;
            sum += ld;
            n = n /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(printSum(1234));

    }
}
