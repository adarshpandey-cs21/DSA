package Self_Practice.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//leetcode 498
public class Diagonal_Traverse {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }
    public static int [] findDiagonalOrder(int [][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int []ans=new int [n*m];
        int k=0;
        for (int d = 0; d <n+m-1 ; d++) {
            int row=0;
            int col=0;
            if(d<m){
                row=0;
                col=d;
            }else{
                row=d-m+1;
                col=m-1;

            }
            ArrayList<Integer> l=new ArrayList<>();
            while (row<n &&col>=0){
                l.add(arr[row][col]);
                row++;
                col--;
            }
            if(d%2==0){
                Collections.reverse(l);
            }
            for(int i : l){
                ans[k]=i;
                k++;
            }
        }
        return ans;
    }
}
