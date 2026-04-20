/*
Q11 Find path with minimum sum in grid.
*/
import java.util.*;
public class MinPathSum {

    public static void main(String[] args) {

        int[][] grid={{1,3,1},{1,5,1},{4,2,1}};

        int m=grid.length,n=grid[0].length;

        for(int i=1;i<m;i++)
            grid[i][0]+=grid[i-1][0];

        for(int j=1;j<n;j++)
            grid[0][j]+=grid[0][j-1];

        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);

        System.out.println("Output: "+grid[m-1][n-1]);
    }
}