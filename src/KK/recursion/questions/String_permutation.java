package KK.recursion.questions;



public class String_permutation {
    public static void main(String[] args) {
        printPer("abc","");
    }
    public static void printPer(String str,String ans){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        for (int i = 0; i <=ans.length() ; i++) {

            String st1=ans.substring(0,i);
            String st2=ans.substring(i,ans.length());
            printPer(str.substring(1),st1+ch+st2);
        }
    }
}
