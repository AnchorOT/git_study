package com.learn.list;

import jdk.internal.org.objectweb.asm.util.ASMifiable;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("张三");
        list.add("");
        list.add("张三");
        list.add("李四");

    }
}
