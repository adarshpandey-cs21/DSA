package SU_150.backTracking_Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Rat_Chases_its_cheese_way2 {
    static boolean check= false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c= sc.nextInt();
        char [][] arr=new char[r][c];
        for (int i = 0; i <arr.length ; i++) {
            String str=sc.next();
            for (int j = 0; j <str.length() ; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        int [][] ans=new int[r][c];
        printPath(arr,0,0,ans);
        if(check==false){
            System.out.println("NO PATH FOUND");
        }
    }
    static void printPath(char[][]arr,int cr,int cc,int [][] ans){
        if(cr== arr.length-1 && cc==arr[0].length-1 && arr[cr][cc]!='X'){
            ans[cr][cc]=1;
            check=true;
           print(ans);

            return;
        }
        if(cr<0||cc<0||cr>= arr.length||cc>=arr[0].length || arr[cr][cc]=='X'){

            return;
        }
        arr[cr][cc]='X';
        ans[cr][cc]=1;
        int[] r={-1,1,0,0};
        int []c={0,0,1,-1};

//        printPath(arr,cr-1,cc,ans);//up
//        printPath(arr,cr+1,cc,ans);//down
//        printPath(arr,cr,cc+1,ans);//right
//        printPath(arr,cr,cc-1,ans);//left
        for (int i = 0; i <c.length ; i++) {
            printPath(arr,cr+r[i],cc+c[i],ans);
        }

        arr[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void print(int[][]ans){
        for (int i = 0; i <ans.length ; i++) {
            for (int j = 0; j <ans[0].length ; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

  /*  Sample Input
5 4
        OXOO
        OOOX
        XOXO
        XOOX
        XXOO
        Sample Output
        1 0 0 0
        1 1 0 0
        0 1 0 0
        0 1 1 0
        0 0 1 1  */

