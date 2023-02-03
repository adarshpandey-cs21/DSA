package KK.searching;

public class OrderAgnostBS {
    static int search(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end - start)/2;
            if(target==arr[mid]){
                return mid;
            } else if (arr[start]<arr[end]) {
                if(target>arr[mid]){
                    start=mid+1;
                } else if (target<arr[mid]) {
                    end=mid-1;
                }

            }
            else {
                if(target<arr[mid]){
                    start=mid+1;
                } else if (target>arr[mid]) {
                    end=mid-1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int []arr = {1,3,4,5,6,41,67,98,104,122,134};
//        int target=6;
        int []arr = {44,43,39,37,34,29,28,27,18,12,11,9,6,4,3};
        int target=28;
        System.out.println(search(arr,target));



    }
}
