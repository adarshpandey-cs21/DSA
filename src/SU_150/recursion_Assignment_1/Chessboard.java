package SU_150.recursion_Assignment_1;

public class Chessboard {
//    static int count=0;
    public static void main(String[] args) {
        int n=1;
        printChessPath(n,0,0,"{0-0}");
        System.out.println("\n"+countChessPath(n,0,0,"{0-0}"));
//        System.out.println("\n"+count);
    }
    //{0-0}K{2-1}R{2-2} {0-0}K{1-2}R{2-2} {0-0}R{0-1}K{2-2} {0-0}R{0-1}R{0-2}R{1-2}R{2-2}
    // {0-0}R{0-1}R{0-2}R{2-2} {0-0}R{0-1}R{1-1}B{2-2} {0-0}R{0-1}R{2-1}R{2-2}
    // {0-0}R{0-2}R{1-2}R{2-2} {0-0}R{0-2}R{2-2} {0-0}R{1-0}K{2-2} {0-0}R{1-0}R{1-1}B{2-2}
    // {0-0}R{1-0}R{1-2}R{2-2} {0-0}R{1-0}R{2-0}R{2-1}R{2-2} {0-0}R{1-0}R{2-0}R{2-2}
    // {0-0}R{2-0}R{2-1}R{2-2} {0-0}R{2-0}R{2-2} {0-0}B{1-1}B{2-2} {0-0}B{2-2}
    public static void printChessPath(int n,int cr,int cc,String ans ) {
        if (cr == n - 1 && cc == n - 1) {
            System.out.print(ans + " ");

            return;
        }
        if (cr >= n || cc >= n) {
            return;
        }
        printChessPath(n, cr + 2, cc + 1, ans + "K{" + (cr + 2) + "-" + (cc + 1) + "}");
        printChessPath(n, cr + 1, cc + 2, ans + "K{" + (cr + 1) + "-" + (cc + 2) + "}");
        if (cc == 0 || cr == 0 || cc == n - 1 || cr == n - 1) {
            for (int i = 1; i < n; i++) {
                printChessPath(n, cr, cc + i, ans + "R{" + (cr) + "-" + (cc + i) + "}");
            }

        }
        if (cc == 0 || cr == 0 || cc == n - 1 || cr == n - 1) {
            for (int i = 1; i < n; i++) {
                printChessPath(n, cr + i, cc, ans + "R{" + (cr + i) + "-" + (cc) + "}");
            }
        }


//        printChessPath(n,cr+2,cc,ans+"R{"+(cr+2)+"-"+(cc)+"}");
//        printChessPath(n,cr,cc+2,ans+"R{"+(cr)+"-"+(cc+2)+"}");
        if(cr==cc || cr+cc==n-1){
            for (int i=1;i<n;i++){
                printChessPath(n,cr+i,cc+i,ans+"B{"+(cr+i)+"-"+(cc+i)+"}");
            }
        }

    }

    public static int countChessPath(int n,int cr,int cc,String ans ) {
        if (cr == n - 1 && cc == n - 1) {

            return 1;
        }
        if (cr >= n || cc >= n) {
            return 0;
        }
        int k1 = countChessPath(n, cr + 2, cc + 1, ans + "K{" + (cr + 2) + "-" + (cc + 1) + "}");
        int k2 = countChessPath(n, cr + 1, cc + 2, ans + "K{" + (cr + 1) + "-" + (cc + 2) + "}");
        int r1=0;
        int r2=0;
        int b=0;

        if (cc == 0 || cr == 0 || cc == n - 1 || cr == n - 1) {
            for (int i = 1; i < n; i++) {
                r1+=countChessPath(n, cr, cc + i, ans + "R{" + (cr) + "-" + (cc + i) + "}");
            }

        }
        if (cc == 0 || cr == 0 || cc == n - 1 || cr == n - 1) {
            for (int i = 1; i < n; i++) {
                  r2+=countChessPath(n, cr + i, cc, ans + "R{" + (cr + i) + "-" + (cc) + "}");
            }
        }



        if (cr == cc) {
            for (int i = 1; i < n; i++) {
                 b+=countChessPath(n, cr + i, cc + i, ans + "B{" + (cr + i) + "-" + (cc + i) + "}");
            }
        }
        return k1+k2+r1+r2+b;
    }
}
