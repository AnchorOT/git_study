package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GenericityMethod1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("abc");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        String[] array1 = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array1));


    }
}
