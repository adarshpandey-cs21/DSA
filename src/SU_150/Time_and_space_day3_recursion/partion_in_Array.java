package SU_150.Time_and_space_day3_recursion;

import java.util.Arrays;

public class partion_in_Array {
    public static void main(String[] args) {
        int []arr={5,7,2,3,8,9,1,4};


        System.out.println(partion(arr,0, arr.length-1));
        System.out.println(Arrays.toString(arr));
    }
    public  static int partion(int[]arr,int s,int e) {
        int item = arr[e];
        int pi = s;
        for (int i = s; i <= e; i++) {
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
