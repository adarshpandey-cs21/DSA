package KK.recursion;

public class countZero {
    public static void main(String[] args) {
        int n=10105001;
        System.out.println(count(n,0));

    }
    public static int count(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return count(n/10,count+1);
        }else{
            return count(n/10,count);
        }
    }
}

