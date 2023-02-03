package KK.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int []arr){
        int i=0;

        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap (int []arr,int first,int last ) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
