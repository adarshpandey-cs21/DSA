package Self_Practice.Array;

import java.util.Arrays;

public class ReversalAlgo_rotateArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []nums= {1,2,3,4,5,6,7};
        int k=3;
        int end=nums.length-1;
        reverse(nums,nums.length-k ,end);
        reverse(nums, 0, end-k);
        reverse(nums, 0, end);

        System.out.println(Arrays.toString(nums));

    }
    static void reverse(int []nums,int start,int end) {
        while(start<end) {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
