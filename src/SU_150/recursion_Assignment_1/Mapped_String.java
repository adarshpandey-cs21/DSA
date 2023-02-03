package SU_150.recursion_Assignment_1;

import java.util.ArrayList;

public class Mapped_String {
    static ArrayList<String> l=new ArrayList<>();
    public static void main(String[] args) {
        String str="123";
        int []arr=new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i]=str.charAt(i)-'0';
        }

        mapString(arr,0,"");
    }
    public static void mapString(int []arr,int idx,String ans){
        if(idx==arr.length){
            System.out.println(ans);
            return;
        }
        int n=arr[idx];
        char ch=(char)('A'+n-1);
        mapString(arr,idx+1,ans+ch);

        if(idx+1<arr.length){
            int m=arr[idx]*10+arr[idx+1];
            if(m<=26){
                char ch1=(char)('A'+m-1);
                mapString(arr,idx+2,ans+ch1);
            }
        }
    }
}
