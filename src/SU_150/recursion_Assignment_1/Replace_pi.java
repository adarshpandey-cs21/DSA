package SU_150.recursion_Assignment_1;

public class Replace_pi {
    public static void main(String[] args) {
    String str="xpipippixx";
    replcePi(str,"");

}
    public static void replcePi(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.length()>1&&str.charAt(0)=='p'&&str.charAt(1)=='i'){
            replcePi(str.substring(2),ans+"3.14");
        }else{
            replcePi(str.substring(1),ans+str.charAt(0));
        }

    }
}