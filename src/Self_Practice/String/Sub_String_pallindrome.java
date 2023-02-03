package Self_Practice.String;

public class Sub_String_pallindrome {
    public static void main(String[] args) {

        String s="nitin";
        printSubstring(s);
    }
    static void printSubstring(String s) {
        for(int i=0;i<=s.length();i++)
            for(int j=i+1;j<=s.length();j++) {
                String k=s.substring(i,j);
                if(isPallindrome(k)) {
                    System.out.println(k);
                }
            }
    }

    static boolean isPallindrome(String s) {
        int start=0;
        int end=s.length()-1;

        while(start<end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;


            }
            start++;
            end--;
        }
        return true;
    }
}
