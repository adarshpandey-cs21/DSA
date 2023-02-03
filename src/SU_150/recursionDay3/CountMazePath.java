package SU_150.recursionDay3;

public class CountMazePath {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int r=3;
        int c=3;
        System.out.println(countPath(c, r, 0, 0, ""));

    }
    static int countPath(int n ,int m,int cc,int cr ,String ans) {
        if(cc==m-1 && cr==n-1) {
//			System.out.println(ans);
            return 1;
        }
        if(cc>=m||cr>=n) {
            return 0;
        }
        int k=countPath(n, m, cc, cr+1, ans+"V");
        int p=countPath(n, m, cc+1, cr, ans+"H");
        int x=countPath(n, m, cc+1, cr+1, ans+"D");

        return k+p+x;
    }

}
