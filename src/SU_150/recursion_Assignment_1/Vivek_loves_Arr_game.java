package SU_150.recursion_Assignment_1;

public class Vivek_loves_Arr_game {
    public static void main(String[] args) {
        int []arr={3,3,3};
        int[]arr1={2,2,2,2};
        int []arr2={4,1,0,1,1,0,1};
        System.out.println(arrSum(arr,0,arr.length-1));
        System.out.println(arrSum(arr1,0,arr1.length-1));
        System.out.println(arrSum(arr2,0,arr2.length-1));


    }
    public static int arrSum(int []arr,int sidx,int eidx ){

        for (int mid = sidx; mid <eidx ; mid++) {
            int lsum=0;
            for (int j = sidx; j <=mid ; j++) {
                lsum+=arr[j];
            }

            int rsum=0;
            for (int k = mid+1; k <=eidx ; k++) {
                rsum+=arr[k];
            }
            if(lsum==rsum){
                int m=arrSum(arr,sidx,mid);
                int o=arrSum(arr,mid+1,eidx);
                return Math.max(m,o)+1;
            }
        }
        return 0;
    }
}
