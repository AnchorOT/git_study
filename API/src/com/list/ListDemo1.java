package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// arraylist 是数组 增删慢 查询快
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);
    }
}
