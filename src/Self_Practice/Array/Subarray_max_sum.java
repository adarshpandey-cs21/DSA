package Self_Practice.Array;

public class Subarray_max_sum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr= {-5,-3,-2,-11};
        System.out.println(sumSubarray(arr));

    }
    static int sumSubarray(int []arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {

                sum+=arr[j];
                if(sum>max) {
                    max=sum;
                }
            }
        }

        return max;
    }

}
