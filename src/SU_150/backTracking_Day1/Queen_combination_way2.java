package SU_150.backTracking_Day1;
//Queen combination with String
public class Queen_combination_way2 {
    public static void main(String[] args) {
        String str="abcd";
        int n=2;
        printComb(str,n,"");
    }
    public static void printComb(String str ,int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        if(str.length()==0){
            return;
        }
        char ch =str.charAt(0);
        printComb(str.substring(1),n,ans+ch);
        printComb(str.substring(1),n,ans);

    }
}
