package SU_150.recursionDay1;

public class  Str {

    public static void main(String args[]) {
        String s="abc";
        printSubSeq(s, "");
    }
    static void printSubSeq(String s,String ans) {

        if(s.length()==0) {
            System.out.print(ans+" ");

            return;
        }
        char ch =s.charAt(0);
        printSubSeq(s.substring(1),ans);
        printSubSeq(s.substring(1), ans+ch);

    }
}



