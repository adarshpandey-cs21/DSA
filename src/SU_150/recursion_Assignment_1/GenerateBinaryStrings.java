package SU_150.recursion_Assignment_1;
import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String args[]) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            String str =sc.next();
//        }
        String str="1k1k1";
        generateBinary(str,"");

    }
    public static void generateBinary(String str,String ans){
        if(str.length()<=0) {
            System.out.println(ans + " ");
            return;
        }
            if(str.charAt(0)=='k'){
                generateBinary(str.substring(1),ans+"0");
                generateBinary(str.substring(1),ans+"1");
            }else{
                generateBinary(str.substring(1),ans+str.charAt(0));
        }
    }
}