package SU_150.recursion_Assignment_1;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrderLarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String quest=sc.next();
        String []srr=quest.split("");
        Arrays.sort(srr);
        String  sstr="";
        for (int i = 0; i <srr.length ; i++) {
            sstr+=srr[i];
        }
        dictionaryLarge(quest,sstr,"");
    }
    public static void dictionaryLarge(String quest,String sort,String ans){
        if(sort.length()==0 && quest.compareTo(ans)<0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <sort.length() ; i++) {
            String str1=sort.substring(0,i);
            String str2=sort.substring(i+1);
            char cr=sort.charAt(i);
            dictionaryLarge(quest,str1+str2,ans+cr);
        }
    }
}
