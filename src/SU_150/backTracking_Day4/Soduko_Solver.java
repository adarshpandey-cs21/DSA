package SU_150.backTracking_Day4;

public class Soduko_Solver {
    public static void main(String[] args) {
        int [][] grid= {{5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9} };

        solve(grid,0,0);
    }

    public static void solve(int[][]grid,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            display(grid);
            return;
        }
        if(grid[row][col]!=0) {
            solve(grid,row,col+1);
        }
        else{
            for (int val = 1; val <= 9; val++) {
                if (isSafe(grid, row, col, val)) {
                    grid[row][col] = val;
                    solve(grid, row, col + 1);
                    grid[row][col] = 0;

                }
            }
        }
    }

    private static boolean isSafe(int[][] grid, int row, int col, int val) {
        //row
        for (int c = 0; c < grid.length ; c++) {
            if(grid[row][c]==val){
                return false;
            }
        }
        ///col
        for (int r = 0; r < grid.length ; r++) {
            if(grid[r][col]==val){
                return false;
            }
        }
        //
        int r=row-row%3;
        int c=col-col%3;
        for (int i = r; i <r+3 ; i++) {
            for (int j = c; j <c+3 ; j++) {
                if(grid[i][j]==val){
                    return false;
                }
            }

        }
        return true;
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
