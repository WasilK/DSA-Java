package TwoDArrays;
import java.util.*;

public class TwoD1 {
    public static boolean searchKey(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Fount at (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        //input
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        searchKey(matrix, 5);
    }
}
