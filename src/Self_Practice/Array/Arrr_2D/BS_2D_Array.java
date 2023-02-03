package Self_Practice.Array.Arrr_2D;

import java.util.Arrays;

public class BS_2D_Array {
    public static void main(String[] args) {
        int [][]arr={{28,33,45},{30,34,46},{57,68,77}};
        int target=77;
        System.out.println(Arrays.toString(bs2d(arr,target)));
    }
    public static int [] bs2d(int[] []arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while (col>=0 && row< arr.length){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if (arr[row][col]>target) {
                col--;
            }
            else if(arr[row][col]<target){
                row++;
            }
        }
        return  new int[]{-1,-1};
    }
}
