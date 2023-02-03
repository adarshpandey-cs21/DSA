package Self_Practice.Array.Arrr_2D;

import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int [n][];
        for (int i = 0; i <n ; i++) {
            int col=sc.nextInt();
            arr[i]=new int[col];
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=sc.nextInt();
            }            
        }
        for (int i = 0; i <n ; i++) {


            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
