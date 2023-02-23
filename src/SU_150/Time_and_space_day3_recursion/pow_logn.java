package SU_150.Time_and_space_day3_recursion;

public class pow_logn {
    public static void main(String[] args) {
        System.out.println(pow(2,8));
    }
    public static  int pow(int a,int b){
        if(b==0){
            return  1;
        }
        if(b%2==0){
            return pow(a*a,b/2);
        }
        else{
            return a*pow(a,b-1);
        }


//        int ans=pow(a,b/2);
//        ans=ans*ans;
//        if(b%2!=0){
//            ans*=a;
//        }
//        return ans;
    }
}
