package SU_150.recursion_Assignment_1;

import java.util.Arrays;

public class DictionaryOrderSmall {
    static int c=0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s="cab";
        String [] srr=s.split("");
        Arrays.sort(srr);
        String k="";
        for(int i=0;i<srr.length;i++){
            k+=srr[i];
        }
        printPermutation(s,k, "");
        System.out.println(c);

    }
    static void printPermutation(String k,String s,String ans) {
        if(s.length()==0 && k.compareTo(ans)>0) {
            System.out.print(ans+" ");
            c++;
            return;
        }

        for(int i =0;i<s.length();i++) {
            String s1=s.substring(0,i);
            String s2=s.substring(i+1);
            char ch=s.charAt(i);
            printPermutation(k,s1+s2, ans+ch);
        }

    }

}

