package SU_150.recursionDay2;

public class Dice3Step {
    public static void main(String args[]) {
        int n=4;
        printStep(0, n,"");

    }
    static void printStep(int src,int des,String ans) {
        if(src==des) {
            System.out.print(ans+" ");
            return;
        }
        if(src>des) {
            return;
        }
        for(int dice=1;dice<=4;dice++) {
            printStep(src+dice, des, ans+dice);
        }




    }

}
