package KK.recursion.questions;

public class String__Start {
    public static void main(String[] args) {
        removeStringHI("heyhiihlohi","");
        removeStringHI_not_HII("heyhiihlohin","");

        removeStringaddBYE("heyhiihlohi","");
    }
    public static void removeStringHI(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.startsWith("hi")){
            removeStringHI(str.substring(2),ans);

        }else{
            removeStringHI(str.substring(1),ans+str.charAt(0));
        }
    }
    public static void removeStringHI_not_HII(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.startsWith("hi") && !str.startsWith("hii")){
            removeStringHI_not_HII(str.substring(2),ans);

        }else{
            removeStringHI_not_HII(str.substring(1),ans+str.charAt(0));
        }
    }
    public static void removeStringaddBYE(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.startsWith("hi")){
            removeStringaddBYE(str.substring(2),ans+"BYE");

        }else{
            removeStringaddBYE(str.substring(1),ans+str.charAt(0));
        }
    }
}
