package Self_Practice.String;

public class Pallindrome {
    public static void main(String[] args) {
        String s="kanaka";
        System.out.println(isPallindrome(s));
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
