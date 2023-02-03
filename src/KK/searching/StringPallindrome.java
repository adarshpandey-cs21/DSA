package KK.searching;

import java.util.Locale;

public class StringPallindrome {
    static boolean isPallin(String str){
        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {

            char start =str.charAt(i);
            char end =str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "abdcba";
        boolean ans=isPallin(name);
        System.out.println(ans);

    }
}
