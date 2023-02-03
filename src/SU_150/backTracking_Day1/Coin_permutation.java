package SU_150.backTracking_Day1;

public class Coin_permutation {
    static int count=0;
    public static void main(String[] args) {
        int target =10;
        int arr[]={2,3,5};
        coinPossible(arr,0,target,"");
        System.out.println("\n"+count);
    }

    public static void coinPossible(int []arr,int sum,int target,String ans){
        if(sum==target){
            System.out.print(ans+" ");
            count+=1;
            return;
        }
        if(sum>target){
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            coinPossible(arr,sum+arr[i],target,ans+arr[i]);
        }
    }

//    monu way
    public static void coinpossible1(int []arr,int taget,String ans){

    }
}
