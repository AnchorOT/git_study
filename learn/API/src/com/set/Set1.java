package com.set;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        TreeSet<String> set= new TreeSet<>();
        set.add("eee");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
//        set无索引
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
