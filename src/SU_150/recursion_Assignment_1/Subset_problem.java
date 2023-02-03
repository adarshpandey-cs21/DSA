package SU_150.recursion_Assignment_1;

public class Subset_problem {
    public static void main(String[] args) {
        int n=3;
        int []arr={1,2,3};
        int target=3;
        printSubSum(arr,target,0,"",0);
        System.out.println("\n"+countSubSum(arr,target,0,"",0));
    }
    public static void printSubSum(int []arr,int target,int sum,String ans,int idx){
        if(sum==target){
            System.out.print(ans+" ");
        }
        if(sum>target){
            return;
        }
        for (int i = idx; i <arr.length ; i++) {
            printSubSum(arr,target,sum+arr[i],ans+arr[i]+" ",i+1);
        }
    }


    public static int countSubSum(int []arr,int target,int sum,String ans,int idx){
        if(sum==target){
            return 1;
        }
        if(sum>target){
            return 0;
        }
        int k=0;
        for (int i = idx; i <arr.length ; i++) {
            k+=countSubSum(arr,target,sum+arr[i],ans+arr[i]+" ",i+1);
        }
        return k;
    }
}

