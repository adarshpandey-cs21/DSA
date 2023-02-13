package KK.backtracking;

import java.util.Scanner;



public class N_Queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean [][] board1=new boolean[n][n];
        System.out.print(placeQueen(board1,0));

    }
    public static int placeQueen(boolean[][] board,int r){
        if(r== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int col = 0; col < board.length; col++) {
            if(isTrue(board,r,col)){
                board[r][col]=true;
                count+=placeQueen(board,r+1);
                board[r][col]=false;
            }
        }
        return count;
    }

    private static boolean isTrue(boolean[][] board, int row,int col) {
        //for vertical row-wise

        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }
        }
        //for diagonal left
        int minLeft=Math.min(row,col);
        for (int i = 0; i <=minLeft ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        //for diagonal right
        int minRight=Math.min(row,board.length-col-1);
        for (int i = 0; i <=minRight ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }


    private static void display(boolean[][] board) {
        for(boolean[]r:board){
            for (boolean c:r){
                if(c){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }
}
