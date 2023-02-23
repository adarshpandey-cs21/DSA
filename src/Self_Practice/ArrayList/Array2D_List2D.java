package Self_Practice.ArrayList;

import java.util.ArrayList;

public class Array2D_List2D {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9},{10,12,13}};
        ArrayList<ArrayList<Integer>> ll=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arr.length ; i++) {
            //ArrayList<Integer> l=new ArrayList<>();
             ll.add(new ArrayList<>());

            for (int j = 0; j <arr[0].length ; j++) {
                //l.add(arr[i][j]);
                ll.get(i).add(arr[i][j]);
            }
            //ll.add(l);
        }

        System.out.println(ll);
    }

}
