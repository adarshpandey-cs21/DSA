package SU_150.recursion_Assignment_1;

import java.util.Scanner;

public class N_knight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n= sc.nextInt();
        int n=2;
        boolean [][]boardp=new boolean[n][n];
        System.out.print("\n"+place_Knight(boardp,0,0,n));
    }
    public static int place_Knight(boolean[][] board1,int r,int col,int horse){
        if(horse==0){
            display(board1);
            System.out.print(" ");

            return 1;
        }

        if(r==board1.length-1&&col==board1.length){
            return 0;
        }

        if(col==board1.length){
            return place_Knight(board1, r + 1, 0, horse);

        }
        int t=0;
        if(isRight(board1,r,col)){
            board1[r][col]=true;
            t+=place_Knight(board1,r,col+1,horse-1);
            board1[r][col]=false;
        }
        int p=place_Knight(board1,r,col+1,horse);
        return t+p;

    }

    private static boolean isRight(boolean[][] board1, int r, int col) {
        if(isokk(board1,r-2,col-1)){
            if(board1[r-2][col-1]){
                return false;
            }
        }if(isokk(board1,r-1,col-2)){
            if(board1[r-1][col-2]){
                return false;
            }
        }if(isokk(board1,r-2,col+1)){
            if(board1[r-2][col+1]){
                return false;
            }
        }if(isokk(board1,r-1,col+2)){
            if(board1[r-1][col+2]){
                return false;
            }
        }
        return true;
    }

    static boolean isokk(boolean[][]board1,int row,int col){
        if(row>=0&&row<board1.length&&col>=0&&col<board1.length){
            return true;
        }
        return false;
    }
    private static void display(boolean[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                if(board[i][j]){
                    System.out.print("{"+i+"-"+j+"}"+" ");
                }
            }
        }
    }
}


