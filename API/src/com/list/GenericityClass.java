package com.list;

public class GenericityClass{
    public static void main(String[] args) {
        Box<String>box1=new Box<>();
        box1.setElement("aaa");
        String element = box1.getElement();
        System.out.println(element);
        Box<Integer>box2 = new Box<>();
        box2.setElement(19);
        Integer element1 = box2.getElement();
        System.out.println(element1);
    }
}
