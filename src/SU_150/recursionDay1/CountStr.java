package SU_150.recursionDay1;

public class CountStr {
    //	static int count=0;
    public static void main(String args[]) {
        String s="abc";
        System.out.println(countPrintSubSeq(s, ""));
//		System.out.println(count);
    }
    static int countPrintSubSeq(String s,String ans) {

        if(s.length()==0) {
//			System.out.println(ans+" ");
//			count++;

            return 1;
        }
        char ch =s.charAt(0);

        int k=countPrintSubSeq(s.substring(1),ans);

        int p=countPrintSubSeq(s.substring(1), ans+ch);
        return k+p;

    }
}



