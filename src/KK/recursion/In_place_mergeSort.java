package KK.recursion;

import java.util.Arrays;

public class In_place_mergeSort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        //arr=merge(arr);
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(arr.length<=0){
            return;
        }
        if(end-start==1){
            return;
        }
         int mid= start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

         add(arr,start,mid,end);
    }

    public static void add(int []arr,int start,int mid,int end){
        int []mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<end){
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }

    }
}


