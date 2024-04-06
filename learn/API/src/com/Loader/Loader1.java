package com.Loader;

public class Loader1 {
    public static void main(String[] args) {
//        获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
//        获取系统类加载器的父加载器    平台类加载器
        ClassLoader systemClassLoaderParent = systemClassLoader.getParent();
//        获取启动类加载器  启动类加载器
        ClassLoader systemClassLoaderParentParent = systemClassLoaderParent.getParent();
        System.out.println("系统类"+systemClassLoader);
        System.out.println("平台类"+systemClassLoaderParent);
        System.out.println("启动类"+systemClassLoaderParentParent);
    }
}
