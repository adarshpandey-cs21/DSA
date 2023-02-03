package SU_150.backTracking_Day2;
//leetcode 39

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum39 {
    public static void main(String[] args) {
        int[] arr={2,3,6,7};
        int target=7;
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
            int ans=arr[i];
            l.add(ans);
            matchSum(arr,target-arr[i],i,l,l2d);
            l.remove(l.size()-1);
        }
    }
}
