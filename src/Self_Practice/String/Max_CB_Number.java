package Self_Practice.String;

import java.util.Scanner;

public class Max_CB_Number {
    public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String s=sc.next();
        String str="699239";
        printSubstring(str);

    }
    static void printCBnumber(String s) {

    }

    static void printSubstring(String s) {
        for(int len=1;len<=s.length();len++) {
            for(int si=0;si<=s.length()-len;si++) {
                int ei=len+si;
                String st=s.substring(si,ei);
                System.out.println(st);

            }
        }
    }
}
