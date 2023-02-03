package SU_150.recursion_Assignment_1;
import java.util.Scanner;
public class Boardpath {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        printPath(m,n,0,"");
        System.out.print("\n"+countPath(m,n,0,""));
    }
    public static void printPath(int ss,int ds,int cr,String ans ){
        if(ss==cr){
            System.out.print(ans+" ");
            return;
        }
        if(cr>ss){
            return;
        }
        for(int i=1;i<=ds;i++){
            printPath(ss,ds,cr+i,ans+i);
        }


    }
    public static int countPath(int ss,int ds,int cr,String ans ){
        if(ss==cr){
            return 1;
        }
        if(cr>ss){
            return 0;
        }
        int k=0;
        for(int i=1;i<=ds;i++){
            k+=countPath(ss,ds,cr+i,ans+i);
        }
        return k;


    }
}



