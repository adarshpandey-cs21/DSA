package SU_150.backTracking_Day1;

public class Coin_Combination {
    public static void main(String[] args) {
        int target=10;
        int arr[]={2,3,5};
        coinCombination(arr,target,"",0);

    }
    public static void coinCombination(int []arr,int target,String ans,int idx){
        if(target==0){
            System.out.print(ans+" ");
            return;
        }
        if(target<0){
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            coinCombination(arr,target-arr[i],ans+arr[i],i);
        }
    }
}
