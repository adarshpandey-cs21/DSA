package SU_150.recursionDay4;

public class Lexico_Counting {
    public static void main(String []args) {
        int n=1000;
        printLexicoCountting(0,n);


    }
    static void printLexicoCountting(int curr,int n) {
        if(curr>n) {
            return;
        }
        System.out.println(curr);
        int i=0;
        if(curr==0) {
            i=1;
        }

        for(;i<=9;i++) {
            printLexicoCountting(curr*10+i, n);
        }

    }
}
