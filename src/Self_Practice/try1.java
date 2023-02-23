package Self_Practice;

public class try1 {
    public static void main(String[] args) {
        System.out.println(sum("1010","1011","",0));

    }
    static String sum(String a,String b,String ans,int carry){
        if(a.length()==0 && b.length()==0){
            if(carry!=0){
                ans=carry+ans;
            }
            return ans;
        }
        String s1="";
        String s2="";
        int x=0;
        if(a.length()>0){
            x=a.charAt(0)-'0';
            s1=a.substring(1);
        }
        int y=0;

        if(b.length()>0){
            y=b.charAt(0)-'0';
            s2=b.substring(1);
        }
        int sum=(x+y+carry)%2;
        carry=(x+y+carry)/2;

        return sum(s1,s2,sum+ans,carry);

    }
}
