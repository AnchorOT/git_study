package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        int [ ] arr1 = {1,2,3};
        String [] arr2 = {"a","b","c"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

    }
}
