package Self_Practice.Array;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []nums= {1,2,3,4,5,6,7};
        int k=12;
        while(k%nums.length>0) {
            rotate(nums);
            k--;
        }


        System.out.println(Arrays.toString(nums));

    }
    static void rotate(int[]nums) {
        for(int i=nums.length-1;i>0;i--) {
            int temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
        }
    }

}
