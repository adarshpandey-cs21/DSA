package SU_150.recursionDay3;

public class PermutationPossible {
    static int c=0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s="abc";
        printPermutation(s, "");
        System.out.println(c);

    }
    static void printPermutation(String s,String ans) {
        if(s.length()==0) {
            System.out.print(ans+" ");
            c++;
            return;
        }

        for(int i =0;i<s.length();i++) {
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            char ch=s.charAt(i);
            printPermutation(s1+s2, ans+ch);
        }

    }

}

