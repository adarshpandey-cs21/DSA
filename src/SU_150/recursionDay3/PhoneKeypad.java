package SU_150.recursionDay3;

public class PhoneKeypad {
    static String [] key= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        printLetterCombination("12","");
    }
    static void printLetterCombination(String ques,String ans) {
        if(ques.length()==0) {
            System.out.print(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        String press=key[ch-'0'];
        for(int i=0;i<press.length();i++) {
            printLetterCombination(ques.substring(1), ans+press.charAt(i));
        }

    }

}
