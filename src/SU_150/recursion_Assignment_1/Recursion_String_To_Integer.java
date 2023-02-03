package SU_150.recursion_Assignment_1;

import java.util.Scanner;

public class Recursion_String_To_Integer {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //String str=sc.next();
        String str ="1234";
        System.out.println(strToInt(str,0));

    }
    public static int strToInt(String str,int ans){
        if(str.length()==0){
            return ans;
        }
        char ch=str.charAt(0);
        int ck=ch-'0';
        return strToInt(str.substring(1),ans*10+ck);
    }
}

