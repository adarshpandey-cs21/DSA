package KK.Assignment.Recursion;

import java.util.Arrays;

public class Sum_Triangle {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        printSum(arr);
    }
    public static void printSum(int[] arr){
        if(arr.length<1){
            return;
        }
        int []ans=new int[arr.length-1];
        for (int i = 0; i < ans.length ; i++) {
            ans[i]=arr[i]+arr[i+1];
        }
        printSum(ans);
        System.out.println(Arrays.toString(arr));
    }
}
