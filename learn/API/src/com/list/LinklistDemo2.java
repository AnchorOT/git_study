package com.list;

import java.util.Iterator;
import java.util.LinkedList;

//linklist 是链表  增删快 查询慢
public class LinklistDemo2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.addFirst("111");
        list.addLast("222");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
 