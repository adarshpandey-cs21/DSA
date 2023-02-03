package SU_150.backTracking_Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cobination_sum2_40 {
    public static void main(String[] args) {

        int[] arr={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        int target=8;
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> l2d =new ArrayList<>() ;
        matchSum(arr,target,0,l,l2d);
        System.out.println(l2d);
    }
    static void matchSum(int []arr,int target,int idx,List<Integer> l,List<List<Integer>> l2d){
        if(target==0){

                l2d.add(new ArrayList<>(l));

            return;
        }
        if(target<0){
            return;
        }
        for (int i = idx; i < arr.length ; i++) {
            if(i==idx || arr[i]!=arr[i-1]) {
                int ans = arr[i];
                l.add(ans);
                matchSum(arr, target - arr[i], i +1, l, l2d);
                l.remove(l.size() - 1);
            }
        }
    }
}
