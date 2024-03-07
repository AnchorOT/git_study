package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it = list.iterator();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);
    }
}
