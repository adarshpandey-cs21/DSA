package Self_Practice.String;
public class long_vowel_substring {
    public static void main(String[] args) {
        String s="kaeaaaakaeai";
        System.out.println(longestVowelSubstring(s));
    }
    static int longestVowelSubstring(String s) {
        int ans=0;
        int curr=0;
        for(int i=0;i<s.length();i++) {
            char k=s.charAt(i);
            if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u') {
                curr++;
            }
            else {
                curr=0;
            }
            ans=Math.max(ans, curr);
        }


        return ans;
    }

}
