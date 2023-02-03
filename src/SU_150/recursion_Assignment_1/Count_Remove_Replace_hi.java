package SU_150.recursion_Assignment_1;

import SU_150.recursionDay1.Str;

public class Count_Remove_Replace_hi {
    public static void main(String[] args) {
        //String str="hihihihibhhkhil";
        String str="abchibi";

        System.out.println(countHi(str,0));
        removeHi(str,"");
        replaceHi(str,"");

    }
    public static int countHi(String str,int count) {

        if (str.length() == 0) {
            return count;
        }
        if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {

            int k = countHi(str.substring(2), count + 1);
            return k;
        } else {
            int k = countHi(str.substring(1), count);
            return k;
        }
    }


        public static void removeHi(String str, String ans){

            if(str.length()==0){
                System.out.println(ans);
                return;
            }
            if(str.length()>1&&str.charAt(0)=='h'&&str.charAt(1)=='i'){

                removeHi(str.substring(2),ans);
            }else{
                removeHi(str.substring(1),ans+str.charAt(0));
            }


        }

    public static void replaceHi(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        if (str.length() > 1 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {

            replaceHi(str.substring(2), ans+"bye");
        } else {
            replaceHi(str.substring(1), ans + str.charAt(0));
        }
    }
}
