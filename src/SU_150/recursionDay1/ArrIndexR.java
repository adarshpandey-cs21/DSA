package SU_150.recursionDay1;

public class ArrIndexR {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int []arr= {2,3,7,2,5,7,9,7};
        int item=2;
        System.out.println(indexOf(arr, item,arr.length-1));

    }
    static int indexOf(int[] arr,int item,int i) {

        if(i<0) {
            return -1;
        }

        if(arr[i]==item) {

            return i;
        }

        return indexOf(arr, item, i-1);



    }

}

