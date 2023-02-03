package Self_Practice.String;

public class SubString {
    public static void main(String[] args) {
        String s="abcd";
        printSubstring(s);
    }
    static void printSubstring(String s) {
        for(int i=0;i<=s.length();i++)
            for(int j=i+1;j<=s.length();j++) {
                System.out.print(s.substring(i,j)+" ");
            }
    }
}
