package SU_150.recursionDay1;

public class Power {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(powDouble(2.0000,10));


    }
//    public static int pow(int a,int b) {
//        if(b==0) {
//            return 1;
//        }
//
//        return a*pow(a,b-1);
//    }

    public static double powDouble(double a,int b) {
        if(b==0) {
            return 1.0;
        }

        return a*powDouble(a,b-1);
    }
}
