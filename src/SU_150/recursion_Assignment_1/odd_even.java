package SU_150.recursion_Assignment_1;

public class odd_even {
    public static void main(String[] args) {


    int n=5;
    printOdd(n);

}
static void printOdd(int n){
        if(n==0){
        return;
        }
        if(n%2!=0){
        System.out.println(n);
        }
        printOdd(n-1);
        if(n%2==0){
        System.out.println(n);
        }



        }
        }
