package SU_150.backTracking_Day1;

public class Queen_Combination {
    static int k=0;
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean[] board=new boolean[4];
        Combination(board,q,0,"",0);
        System.out.println(k);
    }
    public static void Combination(boolean [] board,int tq,int qpsf, String ans,int idx){
        if(qpsf==tq){
            System.out.println(ans);
            k+=1;
            return;
        }


        for (int i=idx; i <board.length ; i++) {
            if(board[i]==false){
                board[i]=true;
                Combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false; //undo / backtracking (explicity) //recursion doesnot change things in heap area so ww have to do forcefully
            }

        }
    }
}
