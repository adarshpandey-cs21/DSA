package KK.searching;

public class DescBinarysearch {
    static int searchDesc(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                start=mid+1;
            } else if (target>arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {44,43,39,37,34,29,28,27,18,12,11,9,6,4,3};
        int target=4;
        System.out.println(searchDesc(arr,target));



    }
}

