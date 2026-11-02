package TwoDArrays;

public class TwoD6 {
    public static int printNumber(int matrix[][], int key){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

    public static int printSumSecondRow(int matrix[][]){
        int sum = 0;

            for(int j = 0; j < matrix[0].length; j++){
                sum += matrix[1][j];
            }

        return sum;
    }

    public static int[][] transposeMatrix(int matrix[][]){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int transpose[][] = new int[cols][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printArray(transpose);
        return transpose;
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
//        int matrix[][] = {{1,4,9}, {11,4,3}, {2,2,3}};
//        System.out.println(printNumber(matrix, 7));
//        System.out.println(printSumSecondRow(matrix));
        int matrix[][] = {{1,2}, {3,4}, {5,6}};
        transposeMatrix(matrix);


    }
}
