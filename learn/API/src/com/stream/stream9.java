package com.stream;

import com.domain.Actor;

import java.util.ArrayList;
import java.util.stream.Stream;

public class stream9 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("郑伊健");
        manList.add("徐峥");
        manList.add("王宝强");
        ArrayList<String> womenList = new ArrayList<>();
        womenList.add("郑爽");
        womenList.add("杨紫");
        womenList.add("关晓彤");
        womenList.add("张天爱");
        womenList.add("杨幂");
        womenList.add("赵丽颖");
        Stream<String> stream1 = manList.stream().filter(name -> name.length() == 3).limit(2);
        Stream<String> stream2 = womenList.stream().filter(name -> name.startsWith("杨")).skip(1);
        Stream.concat(stream1,stream2).forEach(name ->{
            Actor actor = new Actor(name);
            System.out.println(actor);
        });
    }
}
