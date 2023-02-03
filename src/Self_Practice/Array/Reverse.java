package Self_Practice.Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String args[]) {
        int []arr= {1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
//		for(int i=0;i<arr.length/2;i++) {
//			swap(arr,i,end);
//			end--;
//		}
        while(start<=end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr,int start,int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}


