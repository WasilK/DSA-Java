package loops;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class PatternsTwo {
    public static void main(String[] args) {
        //Hollow Rectangle Pattern
//        int m = 5;
//        int n = 4;
//        for(int i = 1; i <= m; i++){
//            for(int j = 1; j <= n; j++){
//                if(i == 1 || j == 1 || i == m || j == n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //inverted and rotated half pyramid
//        int n = 4;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int  j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Inverted half Pyramid with numbers
//        int n = 5;
//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //floyds triangle
//        int n = 5;
//        int counter = 1;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(counter + " ");
//                counter++;
//            }
//            System.out.println();
//        }
        //0-1 triangle
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j<= i; j++){
//                if((i+j) % 2 == 0){
//                    System.out.print(1 + " ");
//                }else{
//                    System.out.print(0 + " ");
//                }
//            }
//            System.out.println();
//        }
        //butterfly pattern
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            for(int j = 1; j<= 2 * (n-i); j++){
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        //2nd half
//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            for(int j = 1; j<= 2 * (n-i); j++){
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //rhombus pattern
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // hollow rhombus pattern
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= n; j++){
//                if(i == 1 || j == 1 || i == n || j == n){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //diamond pattern
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            for(int j = 2; j <= i; j++){
//                System.out.print("*");
//            }
//            for(int j = 1; j <= (2*i)-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = n; i >= 1; i--){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            for(int j = 2; j <= i; j++){
//                System.out.print("*");
//            }
            //another way to print stars
//            for(int j = 1; j <= (2*i)-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
