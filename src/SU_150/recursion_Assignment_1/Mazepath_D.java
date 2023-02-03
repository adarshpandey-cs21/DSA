package SU_150.recursion_Assignment_1;
import java.util.*;
public class Mazepath_D {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int r=3;//sc.nextInt();
        int c=3;//sc.nextInt();
        printPath(r,c,0,0,"");
        System.out.print("\n"+countPath(r,c,0,0,""));
    }
    public static void printPath(int r,int c,int cr,int cc,String ans ){
        if(cc==c-1 && cr==r-1){
            System.out.print(ans+" ");
            return;
        }
        if(cc>=c||cr>=r){
            return;
        }
        printPath(r,c,cr+1,cc,ans+"V");
        printPath(r,c,cr,cc+1,ans+"H");
        printPath(r,c,cr+1,cc+1,ans+"D");

    }

    public static int countPath(int r,int c,int cr,int cc,String ans ){
        if(cc==c-1 && cr==r-1){
            return 1;
        }
        if(cc>=c||cr>=r){
            return 0;
        }
        int k=countPath(r,c,cr+1,cc,ans+"V");
        int p=countPath(r,c,cr,cc+1,ans+"H");
        int t=countPath(r,c,cr+1,cc+1,ans+"D");

        return k+p+t;

    }
}
