package com.junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemo1 {
    public static void main(String[] args) {

    }
@Before
    public void before(){

        System.out.println("before");
    }
    @Test
    public void test(){

        System.out.println("test");
    }
    @After
    public void after(){

        System.out.println("after");
    }
}
