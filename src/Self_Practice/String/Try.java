package Self_Practice.String;

public class Try {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str ="hello"; // form in string pool in heap
        String str1="hello"; // pointing to the same memory location as above

        String st =new String("hello"); //form in heap
        String st1=new String("hello"); //it also form in heap but at different location

//        System.out.println(str==str1); //it return true because "==" compare memory location
//        System.out.println(st==st1); //return false because both have different memory location
//
//
//        System.out.println(st.equals(st1)); //return true .equals check the content

        String s="afc";
        String s1="aab";

        System.out.println(s.compareTo(s1));
//
//        System.out.println(10+10+str); //20hello
//        System.out.println(str+10+10); //hello1010
//        System.out.println(str+(10+10));//hello20



    }


}
