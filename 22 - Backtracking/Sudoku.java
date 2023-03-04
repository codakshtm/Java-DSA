public class Sudoku {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column
        for(int i = 0; i<= 8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // row
        for(int j = 0; j<=8; j++){
            if(sudoku[row][j] == digit) {
                return false;
            }
        }

        // grid 
         
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        // base case
        if(row == 9 && col == 9){
            return true;
        }
        else if(row == 9){
            return false;
        }

        // recursion
        int nextRow = row, nextCol = col+1;
        if(nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                sudokuSolver(sudoku, nextRow, nextCol){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
    }
    public static void main(String args[]){
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3} };

    }
}
