package SU_150.recursion_Assignment_1;

public class All_indices {
    public static void main(String[] args) {

        int []arr={3,2,1,2,3};
//        for(int i=0;i<n;i++){
//
//            arr[i]=sc.nextInt();
//        }
        int target=2;

        printIndices(arr,target,0);
    }
    static void printIndices(int[]arr,int target,int len){
        if(arr.length==len){
            return;
        }
        if(arr[len]==target){
            System.out.print(len+" ");
        }
        printIndices(arr,target,len+1);
    }


}
