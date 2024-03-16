package com.variableparameter;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
//在List，Set，Map接口中都存在of方法，可以创建一个不可变集合。 这个集合不可更改 可以结合集合的有参构造，可以实现批量添加。
public class VariableParameter2 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }

    private static void method4() {
//        可以提高代码的阅读性
        Map<String, String> map = Map.ofEntries(
                Map.entry("alice", "beijing"),
                Map.entry("tom", "shanghai"));
        System.out.println(map);
    }

    private static void method3() {
        Map<String, String> map = Map.of("alice", "beijing", "tom", "shanghai", "lisa", "tianjin");
        System.out.println(map);
    }

    private static void method2() {
        //        参数不可重复
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);
    }

    private static void method1() {
        List<String> list = List.of("a", "b", "c", "d");
        System.out.println(list);
//        list.add("1");
//        批量添加集合
        ArrayList<String> list1 = new ArrayList<>(List.of("a", "b", "c", "d"));
        System.out.println(list1);
    }
}
