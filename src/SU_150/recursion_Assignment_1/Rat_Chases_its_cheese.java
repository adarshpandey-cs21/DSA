package SU_150.recursion_Assignment_1;

import java.util.Arrays;
import java.util.Scanner;

public class Rat_Chases_its_cheese {
    static boolean check= false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m= sc.nextInt();
        char [][] arr=new char[n][m];
        for (int i = 0; i <arr.length ; i++) {
            String str=sc.next();
            for (int j = 0; j <str.length() ; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        int [][] ans=new int[n][m];
        printPath(arr,0,0,ans);
        if(check==false){
            System.out.println("NO PATH FOUND");
        }
    }
    static void printPath(char[][]arr,int cr,int cc,int [][] ans){
        if(cr== arr.length-1 && cc==arr[0].length-1 && arr[cr][cc]!='X'){
            ans[cr][cc]=1;
            for (int i = 0; i <ans.length ; i++) {
                for (int j = 0; j <ans[0].length ; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
            check=true;
            return;
        }
        if(cr<0||cc<0||cr>= arr.length||cc>=arr[0].length || arr[cr][cc]=='X'){

            return;
        }
        arr[cr][cc]='X';
        ans[cr][cc]=1;

        printPath(arr,cr-1,cc,ans);//up
        printPath(arr,cr+1,cc,ans);//down
        printPath(arr,cr,cc+1,ans);//right
        printPath(arr,cr,cc-1,ans);//left

        arr[cr][cc]='O';
        ans[cr][cc]=1;
    }
}
