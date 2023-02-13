package SU_150.recursion_Assignment_1;

import java.util.Scanner;

public class ObedientString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        if(str.equals("")){
            System.out.println(false);

        }
        else {
            System.out.println(checkstr(str));
        }
    }

    public static boolean checkstr(String str){
        if(str.length()==0){
            return true;
        }
        if(str.startsWith("a")){
            if(str.length()>=3 && str.substring(1,3).equals("bb")){
                return checkstr(str.substring(3));
            }
            else{
                return checkstr(str.substring(1));
            }
        }
        return false;
    }
}
