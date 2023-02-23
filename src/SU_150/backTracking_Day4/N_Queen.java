package SU_150.backTracking_Day4;
//wrong
public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        placeQueen(board,0,n);

    }
    public static void placeQueen(boolean [][]board,int row,int qtp){
        if(qtp==0){
            display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length ; col++) {
            if(isReallySafe(board,row,col)){
                board[row][col]=true;
                placeQueen(board,row+1,qtp-1);
                board[row][col]=false;
            }
        }
    }

    private static boolean isReallySafe(boolean[][] board, int row, int col) {
        for (int i =0; i<row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        //left diagonal
        int r=row;
        int c=col;

        while(r>=0 && c>=0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        int r1=row;
        int c1=col;
        while(r1>=0 && c1<board.length){
            if(board[r1][c1]){
                return false;
            }
            r1--;
            c1++;
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
