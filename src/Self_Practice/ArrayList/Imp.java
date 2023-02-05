package Self_Practice.ArrayList;

import java.net.Socket;
import java.util.ArrayList;

import java.util.Collections;

public class Imp {
    public static void main(String[] args) {
        int i=9;
        Integer i1=i; //Auto boxing --->primitive data type kept in corresponding class


        Integer a=9;
        int a1=a; //Auto unboxing ---> wrapper  class  to primitive data type

        Integer ii=19;
        Integer ii1=19;
        System.out.println(ii==ii1); //true ---> -128 to 127 there is no new address alloted in Integer chache memory for same value

        Integer ii2=190;
        Integer ii3=190;
        System.out.println((ii2==ii3)); //false ---> after 127 there is new address alloted in Integer chache memory for same value


        ArrayList<Integer> li =new ArrayList<>();

        // Add
        //range 0 to size
        li.add(6);
        li.add(9);
        System.out.println(li); // [6,9]
        li.add(0,14); //add at index 0
        System.out.println(li); // [14,6,9]
        li.add(-2);
        li.add(8);
        li.add(14);

        //delete
//        range 0 to size-1
        System.out.println(li);
        System.out.println(li.remove(2));
        System.out.println(li);

        //Get
//        range 0 to size-1
        System.out.println(li.get(3));
        System.out.println(li);


        // Set ---> update the value at given index
        li.set(2,21);
        System.out.println(li);

        // sorting of ArrayList
        Collections.sort(li);
        System.out.println(li);

        // Enhanced for loop
        for(int val : li){
            System.out.print(val+" ");
        }



    }
}
