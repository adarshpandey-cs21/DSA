package SU_150.backTracking_Day2;

import java.util.ArrayList;
import java.util.List;

//litcode 77
//wrong
public class Combinations {
        public static void main(String[] args) {
            int n=3;
            int c=3;
            List<Integer> l=new ArrayList<>();
            List<List<Integer>> ll=new ArrayList<>();
            cobinations(n,1,c,l,ll);
            System.out.println(ll);
        }
        public static void cobinations(int n, int k, int c, List<Integer> l,List<List<Integer>> ll){
            if(c==0 ){
                ll.add(new ArrayList<>(l));
                return;
            }
            for (int i = k; i <=n+1 ; i++) {

                    l.add(i);

                cobinations(n,k+i,c-1,l,ll);
                l.remove(l.size()-1);
            }
        }

}
