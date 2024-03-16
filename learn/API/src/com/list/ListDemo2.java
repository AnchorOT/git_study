package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        指定位置插入
        list.add(1,"a");
//        通过索引删除
        list.remove(0);
//        删除指定元素
        list.remove("c");
//        修改指定位置元素
        list.set(2,"bbb");
//        获取指定index元素
        System.out.println(list.get(2));


//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (String s : list) {
//            System.out.println(s);
//        }
        System.out.println(list);
    }
}
