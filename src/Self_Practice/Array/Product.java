package Self_Practice.Array;

import java.util.Arrays;

public class Product {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr= {2,4,5,3};
        productOf(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void productOf(int []arr) {
        int n=arr.length;
        int []left =new int [n];
        int[]right =new int[n];

        left[0]=1;
        for(int i=1;i<n;i++) {
            left[i]=arr[i-1]*left[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--) {
            right[i]=arr[i+1]*right[i+1];
        }
        for(int i=0;i<n;i++) {
            arr[i]=left[i]*right[i];
        }



    }

}
