package SU_150.backTracking_Day1;

public class Queen_Permutation {
    static int k=0;
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean[] board=new boolean[4];
        Permutation(board,q,0,"");
        System.out.println(k);
    }
//     qpsf = queen placed so far & tq = total queen
    public static void Permutation(boolean [] board,int tq,int qpsf, String ans){
        if(qpsf==tq){
            System.out.println(ans);
            k+=1;
            return;
        }
        for (int i = 0; i <board.length ; i++) {
            if(board[i]==false){
                board[i]=true;
                Permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false; //undo / backtracking (explicity) //recursion doesnot change things in heap area so ww have to do forcefully
            }
        }
    }
}
