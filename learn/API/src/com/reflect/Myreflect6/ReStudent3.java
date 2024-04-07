package com.reflect.Myreflect6;

public class ReStudent3 {
    private void show(){
        System.out.println("私有无返 show");
    }
    public void function1(){
        System.out.println("f1 无参无返");
    }
    public void function2(String name){
        System.out.println("f2 有参无返"+name);
    }
    public String function3(){
        System.out.println("f3 无参有返");
        return "aaa";
    }
    public String function4(String name){
        System.out.println("f4 有参有返"+name);
        return "aaa";
    }
}
