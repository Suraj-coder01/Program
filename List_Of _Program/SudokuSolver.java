/*
Q7 Write a program to solve a Sudoku puzzle by filling the empty cells.
Each row, column and 3x3 box must contain digits 1-9 exactly once.
'.' indicates empty cells.
*/
import java.util.*;
public class SudokuSolver {

    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solve(board);
        print(board);
    }

    static boolean solve(char[][] b) {
        for (int i=0;i<9;i++) {
            for (int j=0;j<9;j++) {

                if (b[i][j]=='.') {

                    for (char c='1';c<='9';c++) {
                        if (isValid(b,i,j,c)) {
                            b[i][j]=c;

                            if (solve(b)) return true;

                            b[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] b,int r,int c,char ch) {
        for (int i=0;i<9;i++) {
            if (b[r][i]==ch || b[i][c]==ch ||
                b[3*(r/3)+i/3][3*(c/3)+i%3]==ch)
                return false;
        }
        return true;
    }

    static void print(char[][] b) {
        System.out.println("Output:");
        for (char[] row : b) {
            for (char c : row) System.out.print(c+" ");
            System.out.println();
        }
    }
}
