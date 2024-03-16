package com.stream;

import java.util.ArrayList;
import java.util.function.Consumer;

public class stream5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");
//        void forEach (Consumer action): 对此六点每个元素执行操作
//        Consumer接口中的方法 void accept (T s): 对给定的参数执行此操作
//        只需要在accept方法中，写上处理的业务逻辑就行
        forEarch(list);
//        long count ():返回流中元素个数
        long count = list.stream().count();
        System.out.println(count);
    }

    private static void forEarch(ArrayList<String> list) {
        list.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );
//        lambda 表达式简化 因为Consumer接口中只有一个accept一个方法
//        list.stream().forEach(
//                (String s) ->{
//                    System.out.println(s);
//                }
//        );
//        进一步简化
        list.stream().forEach(s -> System.out.println(s));


    }
}
