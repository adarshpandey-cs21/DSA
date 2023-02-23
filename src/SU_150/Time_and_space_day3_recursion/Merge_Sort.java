package SU_150.Time_and_space_day3_recursion;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[]arr={2,7,9,1,5};
        System.out.println(Arrays.toString(mergeSort(arr,0, arr.length-1) ));
    }
    public static int[] mergeSort(int[]arr,int s,int e){
        if(s==e){
           int[]bs=new int[1];
           bs[0]=arr[s];
           return  bs;
        }
        int mid=s+(e-s)/2;
        int[]fsa=mergeSort(arr,s,mid);
        int[]ssa=mergeSort(arr,mid+1,e);
        return mergeArr(fsa,ssa);
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
