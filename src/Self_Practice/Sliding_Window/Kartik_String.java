package Self_Practice.Sliding_Window;

public class Kartik_String {
    public static void main(String[] args) {
        String str="abbab";
        int k=2;
        int flipa=maxlengthSubStr(str,k,'a');
        int flipb=maxlengthSubStr(str,k,'b');
        System.out.println(Math.max(flipa,flipb));

    }
    public static int maxlengthSubStr(String que,int k,char ch){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while (ei<que.length()){
//            window grow
                if(que.charAt(ei)==ch){
                   flip++;
                }
            //            window shrink
                while (flip>k && si<=ei){

                    if(que.charAt(si)==ch){
                        flip--;
                    }
                    si++;
                }

//            ans calculate
            ans=Math.max(ans,ei-si+1);
                ei++;

        }
        return ans;
    }
}
