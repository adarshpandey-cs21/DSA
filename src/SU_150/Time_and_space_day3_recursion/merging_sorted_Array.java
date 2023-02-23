package SU_150.Time_and_space_day3_recursion;

import java.util.Arrays;

public class merging_sorted_Array {
    public static void main(String[] args) {
        int[]arr1={2,3,5,7,8,9};
        int []arr2={1,3,5,7,11,13,15};

        System.out.println(Arrays.toString(mergeArr(arr1,arr2)));



    }
    public static int[] mergeArr(int[]arr1,int[]arr2){
        int n= arr1.length;
        int m= arr2.length;
        int []arr=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n&&j<m){
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                k++;
                i++;
            }

                else{
                    arr[k]=arr2[j];
                    k++;
                    j++;
                }


        }
        while(i<n){
            arr[k]=arr1[i];
            k++;
            i++;
        }while (j<m){
            arr[k]=arr2[j];
            k++;
            j++;
        }
        return arr;
    }
}
