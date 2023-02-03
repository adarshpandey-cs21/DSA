package SU_150.recursionDay1;

public class CountCoin1 {
    public static void main (String args[]) {
        int n=3 ;
        System.out.println(countPrintCoinOut(n, ""));


    }
    static int  countPrintCoinOut(int n,String ans) {
        if(n==0) {
//			System.out.println(ans+" ");

            return 1;
        }
        int k=0;

        if(ans.length()==0||ans.charAt(ans.length()-1)!='H') {
            k=countPrintCoinOut(n-1,ans+"H");
        }
        int p=countPrintCoinOut(n-1, ans+"T");
        return k+p;

    }



}

