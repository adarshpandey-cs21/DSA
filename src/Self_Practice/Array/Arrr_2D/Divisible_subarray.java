package Self_Practice.Array.Arrr_2D;

import java.util.Arrays;

public class Divisible_subarray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6};
        int []arr1={1,1,1,1,1};
        int []arr2={5,5,5,5,5};


        System.out.println(goodSubarray(arr));
        System.out.println(goodSubarray(arr1));
        System.out.println(goodSubarray(arr2));

        //below code is for calculate commutative sum
//        int [] num=new int[arr.length+1];
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//            num[i+1]=sum;
//        }
//        System.out.println(Arrays.toString(num));
  }

    public static long goodSubarray(int []arr){
        int n=arr.length;
        long []freq=new long[n];
        int sum=0;
        freq[0]=1;
        for (int i = 0; i <n ; i++) {
            sum=sum+arr[i];
            sum=sum%n;
            if(sum<0){
                sum+=n;
            }
            freq[sum]+=1;

        }
        long ans=0;
        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>=2){
                ans+=(freq[i]*(freq[i]-1))/2;
            }
        }
        return ans;
    }
}
