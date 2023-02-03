package SU_150.recursion_Assignment_1;

import java.util.Scanner;

public class Rat_in_a_maze {

    static boolean catc= false;

    public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);

            int m=sc.nextInt();
            int n= sc.nextInt();
            char [][] arrr=new char[m][n];
            for (int i = 0; i <arrr.length ; i++) {
                String str=sc.next();

                for (int j = 0; j <str.length() ; j++) {
                    arrr[i][j]=str.charAt(j);

                }
            }
            int [][] ans=new int[m][n];
            rightPath(arrr,0,0,ans);
            if(catc==false){
                System.out.println(-1);
            }
    }
    public static void rightPath(char[][]arr,int r,int c,int [][]ans){
        if(r==arr.length-1&&c==arr[0].length-1&& arr[r][c]!='X'){
            ans[r][c]=1;
            print(ans);
            catc=true;
            return;
        }
        if(r>=arr.length || c>=arr[0].length||arr[r][c]=='X'){
            return;
        }

//        int[] r={0,1};
//        int []r={1,0};
//        for (int i = 0; i <r.length ; i++) {
        if(catc==false) {
            arr[r][c] = 'X';
            ans[r][c] = 1;
            rightPath(arr, r, c + 1, ans);
            rightPath(arr, r + 1, c, ans);
            arr[r][c] = 'O';
            ans[r][c] = 0;
        }

//        }



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
/*5 4
        OXOO
        OOOX
        OOXO
        XOOO
        XXOO

 */

/*
1 0 0 0
1 1 0 0
0 1 0 0
0 1 1 1
0 0 0 1
 */