package Self_Practice.Sliding_Window;

public class Maximum_window {
    public static void main(String[] args) {
        int []arr={2,4,22,6,3,11,8,9,24};
        int k=2;
        System.out.println(maxSum(arr,k));
    }
    public static int maxSum(int [] arr,int k){
        int sum=0;
        for (int i = 0; i <k ; i++) {
            sum+=arr[i];
        }
        int max=sum;
        for (int i = k; i < arr.length ; i++) {
            sum=sum+arr[i]; //grow window
            sum-=arr[i-k]; //shrink window
            max=Math.max(sum,max); //ans update
        }
        return max;
    }
}
