package SU_150.backTracking_Day4;

import java.util.Arrays;

public class Queen_2D_board {
    //static int count=0;

    public static void main(String[] args) {
        int r=4;

        int c=4;
        int q=4;
        boolean [][]cBoard=new boolean[r][c];

        System.out.println(printPath(0,0,q,r,c,"",cBoard));
    }

    public static int printPath(int cr,int cc,int qtp,int r,int c,String ans,boolean [] []cBoard){
        if(qtp==0){
//            System.out.println(ans+" ");
            //print(board);
//            count++;
            return 1;
        }
        if(cc==c){
            cc=0;
            cr++;
        }
        if(cr==r){
            return 0;
        }
        int k=0;
        if(isOkk(cr,cc,cBoard)) {
            cBoard[cr][cc] = true;
            k+=printPath(cr, cc + 1, qtp - 1, r, c, ans + "Q{" + cr + "-" + cc + "}", cBoard);

            cBoard[cr][cc] = false;
        }
        int p=printPath(cr, cc + 1, qtp, r, c, ans, cBoard);

        return k+p;

    }
//    public static void print(boolean [][]board){
//        for (int i = 0; i < board.length ; i++) {
//            System.out.print(Arrays.toString(board[i]));
//            System.out.println();
//
//        }
//    }
    public static boolean isOkk(int cr,int cc,boolean[][]board){
        for (int row = cr; row >=0 ; row--) {
            if(board[row][cc]){
                return false;
            }
        }
        for (int col = 0; col < cc; col++) {
            if(board[cr][col]) {
                    return false;
            }
        }

        int r1=cr;
        int c1=cc;
        while(r1>=0 && c1>=0){
            if(board[r1][c1]){
                return false;
            }
            r1--;
            c1--;
        }
        int r2=cr;
        int c2=cc;
        while(r2>=0 && c2< board[0].length){
            if(board[r2][c2]){
                return false;
            }
            r2--;
            c2++;
        }
        return true;
    }
}
