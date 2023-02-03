package SU_150.recursionDay1;

public class CountCoin {
    public static void main (String args[]) {
        int n=3;
        System.out.println(printCoinOut(n, ""));


    }
    static int printCoinOut(int n,String ans) {
        if(n==0) {
//			System.out.println(ans+" ");

            return 1;
        }
        int k=printCoinOut(n-1, ans+"H");
        int p=printCoinOut(n-1, ans+"T");
        return k+p;

    }



}
