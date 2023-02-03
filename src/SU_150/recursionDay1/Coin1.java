package SU_150.recursionDay1;

public class Coin1 {
    public static void main (String args[]) {
        int n=3 ;
        printCoinOut(n, "");


    }
    static void printCoinOut(int n,String ans) {
        if(n==0) {
            System.out.println(ans+" ");
            return;
        }

        if(ans.length()==0||ans.charAt(ans.length()-1)!='H') {
            printCoinOut(n-1,ans+"H");
        }
        printCoinOut(n-1, ans+"T");

    }



}

