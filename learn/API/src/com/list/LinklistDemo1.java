package com.list;

import java.util.Iterator;
import java.util.LinkedList;
//linklist 是链表  增删快 查询慢
public class LinklistDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
