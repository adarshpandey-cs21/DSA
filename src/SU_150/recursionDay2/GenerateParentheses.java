package SU_150.recursionDay2;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=3;
        List<String> l=new ArrayList<String>();
        parentheses(n, "", 0, 0,l);
        System.out.println(l);

    }
    public static void parentheses(int n ,String ans,int open,int close,List<String> l) {
        if(open==n && close==n) {
//			System.out.println(ans+" ");
            l.add(ans);
            return;
        }

        if(open<n) {
            parentheses(n, ans+"(", open+1, close,l);
        }
        if(close<open) {
            parentheses(n, ans+")", open, close+1,l);
        }
    }

}
