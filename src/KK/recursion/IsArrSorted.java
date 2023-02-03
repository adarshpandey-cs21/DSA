package KK.recursion;

public class IsArrSorted {
    public static void main(String[] args) {
        int []arr={1,2,5,18,22};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int []arr,int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr.length>1&&arr[n]>arr[n+1]){
            return false;
        }else{
            return isSorted(arr,n+1);
        }
    }
}
