package SU_150.recursionDay1;

public class Coin {
    public static void main (String args[]) {
        int n=3;
        printCoinOut(n, "");


    }
    static void printCoinOut(int n,String ans) {
        if(n==0) {
            System.out.println(ans+" ");
            return;
        }
        printCoinOut(n-1, ans+"H");
        printCoinOut(n-1, ans+"T");

    }



}
