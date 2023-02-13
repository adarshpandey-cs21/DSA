package KK.recursion;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int []arr={1,0};
        arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge(int[] arr){
        if(arr.length<=0){
            return arr;
        }
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int []left =merge(Arrays.copyOfRange(arr,0,mid));
        int []right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return add(left,right);
    }

    public static int[] add(int []left,int[]right){
        int []ans=new int[left.length+ right.length];
        int l=0;
        int r=0;
        int a=0;
        while (l< left.length && r< right.length){
            if(left[l]< right[r]){
                ans[a]=left[l];
                l++;
            }else {
                ans[a]= right[r];
                r++;
            }
            a++;
        }
        while (l<left.length){
            ans[a]=left[l];
            l++;
            a++;

        }while (r<right.length){
            ans[a]=right[r];
            r++;
            a++;

        }
        return ans;
    }
}
