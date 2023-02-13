package KK.recursion.questions;

public class Sub_String {
    static int c=0;
    public static void main(String[] args) {
        printSub("abc","");
        System.out.println(c);
    }
    public static void printSub(String s,String a){
        if(s.length()==0){
            System.out.print(a+" ");
            c++;
            return;
        }
        printSub(s.substring(1),a);
        printSub(s.substring(1),a+s.charAt(0));

    }
}
