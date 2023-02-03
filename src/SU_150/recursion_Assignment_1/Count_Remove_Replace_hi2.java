package SU_150.recursion_Assignment_1;

import java.util.Scanner;

public class Count_Remove_Replace_hi2 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);

        String str="abchihitfhi";

        System.out.println(countHi(str,0));
        removeHi(str,"");
        replaceHi(str,"");

    }
    public static int countHi(String str,int count) {

        if (str.length() == 0) {
            return count;
        }
        if (str.length() > 2 && str.charAt(0) == 'h' && str.charAt(1) == 'i'&&str.charAt(2)=='t') {

            int k = countHi(str.substring(3), count );
            return k;
        }
        else if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {

            int k = countHi(str.substring(2), count + 1);
            return k;
        }

        else {
            int k = countHi(str.substring(1), count);
            return k;
        }
    }


    public static void removeHi(String str, String ans){

        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.length()>2&&str.charAt(0)=='h'&&str.charAt(1)=='i'&&str.charAt(2)=='t'){

            removeHi(str.substring(3),ans+"hit");
        }  else  if(str.length()>1&&str.charAt(0)=='h'&&str.charAt(1)=='i'){

            removeHi(str.substring(2),ans);
        }

        else{
            removeHi(str.substring(1),ans+str.charAt(0));
        }


    }

    public static void replaceHi(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        if(str.length()>2&&str.charAt(0)=='h'&&str.charAt(1)=='i'&&str.charAt(2)=='t'){

            replaceHi(str.substring(3),ans+"hit");
        }
        else if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {

            replaceHi(str.substring(2), ans+"bye");
        } else {
            replaceHi(str.substring(1), ans + str.charAt(0));
        }
    }
}

