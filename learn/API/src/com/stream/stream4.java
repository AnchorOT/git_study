package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class stream4{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
//        limit截取指定参数个数的数据
        list.stream().limit(2).forEach(s -> System.out.println(s));
        System.out.println("\n");
//        skip 跳过指定参数个数的数据
        list.stream().skip(2).forEach(s -> System.out.println(s));
        System.out.println("\n");
//        contact 合并a和b两个流为一个流
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三丰");
        list2.add("张无忌");
        list2.add("张翠山");
        list2.add("王二麻子");
        list2.add("张良");
        list2.add("谢广坤");
//        Stream<String> stream1 = list.stream();
//        Stream<String> stream2 = list2.stream();
//
//        Stream<String> concat = Stream.concat(stream2, stream1);
//        concat.forEach(s -> System.out.println(s));
        Stream.concat(list.stream(),list2.stream()).forEach(s -> System.out.println(s));
        System.out.println("\n");
//        distinct 去除流中重复的元素，依赖（hashcode和equals方法）
        list.stream().distinct().forEach(s -> System.out.println(s));


    }
}
