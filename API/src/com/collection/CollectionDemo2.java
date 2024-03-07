package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");

//        选择删除
//        boolean remove = collection.remove("a");
//        System.out.println(remove);
//        清空集合
//        collection.clear();
//        条件删除
//        collection.removeIf(
//                (String s)->{
//                    return s.length()==1;
//                }
//        );
//        元素是否存在
//        boolean contains = collection.contains("a");
//        System.out.println(contains);
//        判断集合是否为空
//        boolean empty = collection.isEmpty();
//        System.out.println(empty);
//        集合的长度
        int size = collection.size();
        System.out.println(size);

    }
}
