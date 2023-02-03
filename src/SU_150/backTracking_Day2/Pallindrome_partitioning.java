package SU_150.backTracking_Day2;

//litcode 131

import java.util.*;

public class Pallindrome_partitioning {
    public static void main(String[] args) {
        String s="nitin";
        List<String> l=new ArrayList<>();
        List<List<String>> l2d =new ArrayList<>() ;
        stringPartion(s,l,l2d);
        System.out.println(l2d);
    }
    static void stringPartion(String str,List <String> l,List<List<String>> l2d){
        if(str.length()==0){
            l2d.add(new ArrayList<>(l));
//            System.out.println(l2d);
            return;
        }
        for (int i = 1; i <=str.length(); i++) {
            String part=str.substring(0,i);
            if(isPallindrome(part)) {
                l.add(part);
                stringPartion(str.substring(i), l,l2d);
                //l.remove(part);
                 l.remove(l.size()-1);
            }
        }


    }


    static boolean isPallindrome(String s) {
        int start=0;
        int end=s.length()-1;

        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;


            }
            start++;
            end--;
        }
        return true;
    }
}
