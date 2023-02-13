package Self_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="codeforces";
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            String s=sc.next();
            if(str.contains(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}