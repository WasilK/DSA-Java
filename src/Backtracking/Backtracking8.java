package Backtracking;

public class Backtracking8 {
    public static void printSol(int sol[][]){
        for(int i = 0; i < sol.length; i++){
            for(int j = 0; j < sol[0].length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int maze[][], int n, int m){
        return(n >= 0 && n < maze.length && m >= 0 && m < maze.length && maze[n][m] == 1);
    }

    public static boolean printSolMaze(int maze[][]){
        int n = maze.length;
        int sol[][] = new int[n][n];
        if(solveMaze(maze, 0, 0, sol)){
            printSol(sol);
            return true;
        }
        return false;
    }


    public static boolean solveMaze(int maze[][], int n, int m, int sol[][]){
        if(n == maze.length - 1 && m == maze.length - 1 && maze[n][m] == 1){
            sol[n][m] = 1;
            return true;
        }
        if(isSafe(maze, n, m)){
            if(sol[n][m] == 1){
                return false;
            }
            sol[n][m] = 1;
            if(solveMaze(maze, n + 1, m, sol)){
                return true;
            }
            if(solveMaze(maze, n, m + 1, sol)){
                return true;
            }
            if(solveMaze(maze, n - 1, m, sol)){
                return true;
            }
            if(solveMaze(maze, n , m - 1, sol)){
                return true;
            }
            sol[n][m] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        printSolMaze(maze);
    }
}
