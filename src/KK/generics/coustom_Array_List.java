package KK.generics;

import java.util.Arrays;

public class coustom_Array_List {
    private  int[] data;
    private static int default_size=10;
    private int size=0;

    public coustom_Array_List(){
        data=new int[default_size];
    }
    public void add(int n){
        if(isFull()){
            resize();
        }
        data[size++]=n;
    }

    public int get(int idx){
        return data[idx];
    }
    private boolean isFull(){
        return size== data.length;
    }
    private void resize(){
        int[] temp=new int[2* data.length];
        for (int i = 0; i < data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int size(){
        return size;
    }
    public void set(int idx,int val){
        data[idx]=val;
    }

    @Override
    public String toString() {
        return "coustom_Array_List{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        coustom_Array_List l=new coustom_Array_List();
        l.add(5);
        l.add(7);
        l.set(5,22);
        System.out.println(l);
    }
}
