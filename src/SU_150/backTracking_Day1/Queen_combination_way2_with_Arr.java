package SU_150.backTracking_Day1;

public class Queen_combination_way2_with_Arr {
    public static void main(String[] args) {
        int []arr={0,1,2};
        int n=2;
        printBox(arr,n,"",0);
    }
    public static void printBox(int []arr,int n,String ans,int idx){
        if(n==0){
            System.out.println(ans+" ");
            return;
        }
        if(idx==arr.length){
            return;
        }
        printBox(arr,n-1,ans+"Q"+arr[idx],idx+1);
        printBox(arr,n,ans,idx+1);
    }
}
