package SU_150.recursionDay5;

import java.util.Scanner;

public class TOH {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
        int n=3;
        toh(n,"A","B","C");
    }
    public  static void toh(int n,String src,String help,String des){
        if(n==0){
            return;
        }
        toh(n-1,src,des,help);
        System.out.println("move "+n+"th"+" disk from "+src+" to "+des);
        toh(n-1,help,src,des);
    }


}
