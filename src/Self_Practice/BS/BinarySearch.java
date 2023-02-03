package Self_Practice.BS;

public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr= {1,5,4,8,3,2};
        int target=31;
        System.out.println(bs(arr, target));

    }
    static int bs(int []arr,int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=start-(start-end)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]>target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;


    }

}
