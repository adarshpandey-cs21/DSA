package SU_150.recursionDay3;

import java.util.ArrayList;

public class PermutationPossibleNoDublicate {
    static int c=0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        ArrayList<String> l=new ArrayList<String>();
        String s="abca";
        printPermutation(s, "",l);
        System.out.println(c);
//				System.out.println(l);


    }
    static void printPermutation(String s,String ans,ArrayList<String> l) {
        if(s.length()==0) {
//			if(!l.contains(ans)) {
//				l.add(ans);
//			}
//
            System.out.println(ans);
            c++;
            return;
        }

        for(int i =0;i<s.length();i++) {
            char ch=s.charAt(i);
            boolean flag=true;
            for(int j=i+1;j<s.length();j++) {
                if(s.charAt(j)==ch) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                String s1=s.substring(0,i);
                String s2=s.substring(i+1);

                printPermutation(s1+s2, ans+ch,l);
            }

        }

    }
}
