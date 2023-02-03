package SU_150.recursion_Assignment_1;

import java.util.Scanner;

public class replace0with5 {
    public static void main (String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String str =String.valueOf(n);
//        String  str="103";
    printReplace(str,"");

}
    public static void printReplace(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0)=='0'){
            printReplace(str.substring(1),ans+5);
        }else{
            printReplace(str.substring(1),ans+str.charAt(0));
        }
    }
}