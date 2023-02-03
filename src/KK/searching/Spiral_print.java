package KK.searching;

public class Spiral_print {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiral(arr);
    }
    public static void spiral(int [][]arr){
        int min_row=0;
        int max_row=arr.length-1;
        int min_col=0;
        int max_col=arr[0].length-1;
        int total=arr.length*arr[0].length;
        int count=0;
        while(count<total) {
            for (int i = min_col; i <= max_col&&count<total; i++) {
                System.out.print(arr[min_row][i] + " ");
                count++;

            }
            min_row++;
            for (int i = min_row; i <= max_row&&count<total; i++) {
                System.out.print(arr[i][max_col] + " ");
                count++;
            }
            max_col--;
            for (int i = max_col; i >= min_col&&count<total; i--) {
                System.out.print(arr[max_row][i] + " ");
                count++;
            }
            max_row--;
            for (int i = max_row; i >= min_row &&count<total; i--) {
                System.out.print(arr[i][min_col] + " ");
                count++;
            }
            min_col++;
        }

//        for (int i = min_col; i <=max_col ; i++) {
//            System.out.print(arr[min_row][i]+" ");
//        }
//        min_row++;
//        for (int i = min_row; i <=max_row ; i++) {
//            System.out.print(arr[i][max_col]+" ");
//        }
//        max_col--;
//        for (int i = max_col; i >=min_col ; i--) {
//            System.out.print(arr[max_row][i]+" ");
//        }



    }
}
