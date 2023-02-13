package KK.recursion.questions;

public class Asciii {
    public static void main(String[] args) {
//        char ch='a';
//        char n='4';
//        int ans=5+(n-'0');
//        System.out.println(ans);
//        System.out.println(ch+0);
        printSubAscii("abc","");
    }
    public static void printSubAscii(String s,String a){
        if(s.length()==0){
            System.out.print(a+" ");

            return;
        }

        printSubAscii(s.substring(1),a+s.charAt(0));

        printSubAscii(s.substring(1),a);
        printSubAscii(s.substring(1),a+(s.charAt(0)+0));
    }
}
