package com.list;

import java.util.ArrayList;

public class genericityglobbing {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Number > list2=new ArrayList<>();
        ArrayList<Object > list3=new ArrayList<>();
        printlist(list1);
        printlist(list2);
        printlist(list3);

        methood1(list1);
        methood1(list2);
       // methood1(list3);

        //methood2(list1);
        methood2(list2);
        methood2(list3);


    }

    private static void printlist(ArrayList<?> list) {}
//    传递的集合类型可以是Number的子类及本身
    private static void methood1(ArrayList<? extends Number> list) {}
//    传递的集合类型可以是Number的父类及本身
    private static void methood2(ArrayList<? super Number> list) {}
}
