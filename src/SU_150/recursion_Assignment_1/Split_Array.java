package SU_150.recursion_Assignment_1;

public class Split_Array {
    public static void main(String[] args) {
        int []arr={1,2,3,3,4,5};
        splitSum(arr,0,0,0,"","");
        System.out.println(countSplitSum(arr,0,0,0,"",""));

    }
    public static void splitSum(int[] arr, int idx, int rsum, int lsum, String left, String right){
        if(idx==arr.length){
            if(rsum==lsum){
                System.out.println(left+"and" +right);
                return;
            }
            return;
        }
        splitSum(arr,idx+1,rsum,lsum+arr[idx],left+arr[idx]+" ",right);
        splitSum(arr,idx+1,rsum+arr[idx],lsum,left,right+" "+arr[idx]);

    }

    public static int countSplitSum(int[] arr, int idx, int rsum, int lsum, String left, String right){
        if(idx==arr.length){
            if(rsum==lsum){
                System.out.println(left+"and" +right);
                return 1;
            }
            return 0;
        }
        int k=countSplitSum(arr,idx+1,rsum,lsum+arr[idx],left+arr[idx]+" ",right);
        int p=countSplitSum(arr,idx+1,rsum+arr[idx],lsum,left,right+" "+arr[idx]);
        return k+p;

    }
}
