package com.stream;

import java.util.ArrayList;
import java.util.function.Predicate;

public class stream3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");
//        filter(Predicate predicate):过滤
//        Predicate接口中的方法 boolean test (T t):对给定参数进行判断，返回一个布尔类型
//        filter 方法会获取流中的每一个数据 然后用test方法进行判断

//        list.stream().filter(
//                new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        boolean result = s.startsWith("张");
//                        return result;
//                    }
//                }
//        ).forEach(s-> System.out.println(s));

//        因为Predicate接口中只有一个抽象方法test
//        所以可以用lambda表达式来简化

//        list.stream().filter(
//                (String s)->{
//                    boolean result = s.startsWith("张");
//                    return result;
//
//                }
//        ).forEach(s-> System.out.println(s));

        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }
}
