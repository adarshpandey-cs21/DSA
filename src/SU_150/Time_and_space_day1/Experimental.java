package SU_150.Time_and_space_day1;

public class Experimental {
    public static void main(String[] args) {
        long s=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {

        }
        long e=System.currentTimeMillis();
        System.out.println(e-s);
    }
}
