package Self_Practice.Array;

public class Kadane_Algo {
    public static void main(String[] args) {
        int []arr= {-5,-3,-2,-11};
        System.out.println(sumSubarray(arr));
    }
    static int sumSubarray(int []arr) {
        int ans=Integer.MIN_VALUE;
        int psum=0;
        for(int i=0;i<arr.length;i++) {
            psum+=arr[i];
            ans=Math.max(ans, psum);
            if(psum<0) {
                psum=0;
            }
        }
        return ans;
    }

}
