package SU_150.recursion_Assignment_1;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        int n=4;
        System.out.println(countTrinangleSum(n,0));

    }
    public static int countTrinangleSum(int n,int sum){
        if(n==0){
            return sum;
        }
        return countTrinangleSum(n-1,sum+n);

    }
}
