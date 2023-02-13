package KK.backtracking;

import java.util.Scanner;

public class Soduku_Solver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]board=new int[n][n];
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                board[i][j]=sc.nextInt();
            }
        }
        if(solved(board)){
            display(board);
        }
    }
    public static boolean isRight(int [][] board,int r,int c,int number){
        //for row
        for (int i = 0; i < board.length ; i++) {
            if(board[r][i]==number){
                return false;
            }
        }
        //for col
        for (int []n:board) {
            if(n[c]==number){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int startRow=r-r%sqrt;
        int startCol=c-c%sqrt;
        for (int row = startRow; row <startRow+sqrt ; row++) {
            for (int col =startCol; col <startCol+sqrt ; col++) {
                if(board[row][col]==number){
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solved(int[][]board){
        int n= board.length;
        int r=-1;
        int c=-1;

        boolean left_empty=true;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    left_empty=false;
                    break;
                }

            }
            if(left_empty==false){
                break;
            }
        }
        if(left_empty==true){
            return true;
            //solved
        }
        
        //backtracking
        for (int nums = 1; nums <=9 ; nums++) {
            if(isRight(board,r,c,nums)){
                board[r][c]=nums;
                if(solved(board)){

                    return true;
                    //answer
                }else{
                    board[r][c]=0;
                }
            }
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int []r:board) {
            for (int n:r) {
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}
