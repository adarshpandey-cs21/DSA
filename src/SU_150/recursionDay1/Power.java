package SU_150.recursionDay1;

public class Power {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(pow(3,3));


    }
    public static int pow(int a,int b) {
        if(b==0) {
            return 1;
        }

        return a*pow(a,b-1);
    }

}
