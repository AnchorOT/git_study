package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset5 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });
        
        ts.add("b");
        ts.add("ac");
        ts.add("bd");
        ts.add("aed");
        System.out.println(ts);
    }
}
