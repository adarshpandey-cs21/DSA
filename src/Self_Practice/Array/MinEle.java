package Self_Practice.Array;

public class MinEle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr= {10,7,18,7,-3,11,-9,56};
        int min =arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println(min);

    }

}
