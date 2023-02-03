package KK.searching;

public class BinarySearch {
    static int searchAsc(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end - start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,3,4,5,6,41,67,98,104,122,134};
        int target=134;
        System.out.println(searchAsc(arr,target));



    }
}
