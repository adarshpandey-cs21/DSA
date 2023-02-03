package SU_150.recursionDay3;

public class MazePath {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int r=3;
        int c=3;
        printPath(c, r, 0, 0, "");



    }
    static void printPath(int n ,int m,int cc,int cr ,String ans) {
        if(cc==m-1 && cr==n-1) {
            System.out.print(ans+" ");
            return;
        }
        if(cc>=m||cr>=n) {
            return;
        }
        printPath(n, m, cc, cr+1, ans+"V");
        printPath(n, m, cc+1, cr, ans+"H");
        printPath(n, m, cc+1, cr+1, ans+"D");
    }

}
