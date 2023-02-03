package KK.recursion;

public class ReverseInt {
    public static void main(String[] args) {
        int n=4325;
        System.out.println(reverse(n,0));
    }
    public static int reverse(int n,int sum){
        if(n==0){
            return sum;
        }

        return reverse(n/10,sum*10+n%10);
    }
}
