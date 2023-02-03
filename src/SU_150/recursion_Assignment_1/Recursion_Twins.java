package SU_150.recursion_Assignment_1;
//wrong so;utin
public class Recursion_Twins {
    public static void main(String[] args) {
        String str="AXAXA";
        //Scanner sc=new Scanner(System.in);
        //String str=sc.next();
        System.out.println(countTwins(str,0,0));

    }
    public static int countTwins(String ques,int idx,int count){
        if(idx==ques.length()-2){
            return count;
        }

        if(idx<ques.length()-2) {
            if (ques.charAt(idx) == ques.charAt(idx + 2) && ques.charAt(idx) != ques.charAt(idx + 1)){
                return countTwins(ques, idx + 1, count + 1);
            }
            else{
                return countTwins(ques,idx+1,count);
            }

        }
        return count;

    }
}
