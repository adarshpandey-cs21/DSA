package Self_Practice.Sliding_Window;
//leet code 713
public class Sub_Array_product_less_than_k713 {
    public static void main(String[] args) {
        //int []arr={10,5,2,6};
        int []arr={1,2,3,4,2,3};
        int k=10;
        System.out.println(numOfSubArr(arr,k));
    }
    public static int numOfSubArr(int [] arr,int k){
        int ei=0;
        int si=0;
        int ans=0;
        int p=1;
        while(ei<arr.length){
//            window grow
            p=p*arr[ei];

//            window shrink
            while (p>=k && si<=ei){
                p=p/arr[si];
                si++;
            }
//            ans update
            ans=ans+ei-si+1;
            ei++;


        }
        return ans;
    }
}
