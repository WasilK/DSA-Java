package BitwiseOperators;

public class Bitwise1 {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(18);
    }
}
