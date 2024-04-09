package com.myanno.anno4;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})   //注解使用位置 成员变量 类 方法
@Retention(RetentionPolicy.RUNTIME)//不写表示在Java源码阶段
@Inherited//可继承
public @interface Anno {

}
