package SU_150.Time_and_space_day3_recursion;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int []arr={5,7,2,3,8,9,1,4};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int []arr,int s,int e){
        if(s>=e){
            return;
        }
        int pi=partition(arr,s,e);
        quickSort(arr,s,pi-1);
        quickSort(arr,pi+1,e);
    }
    public  static int partition(int[]arr,int s,int e) {
        int item = arr[e];
        int pi = s;
        for (int i = s; i < e; i++) {
            if (arr[i] <= item) {
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }

        }
        int temp = arr[pi];
        arr[pi] = arr[e];
        arr[e] = temp;
        return pi;
    }
}
