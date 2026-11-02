package TwoDArrays;

public class TwoD2 {
    public static int printLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int printSmallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static void printArray(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        printArray(matrix);
        System.out.println(printLargest(matrix));
        System.out.println(printSmallest(matrix));
    }
}
