package com.myanno.anno2;


public @interface anno1 {
    int a() default 23;

    public String name() default "aaa";

    public Class clazz() default anno2.class;

    public anno2 ANNO() default @anno2;

    public Season SEASON() default Season.SPRING;

    public int[] arr() default {1, 2, 3, 4, 5};

    public Season[] SEASONS() default {Season.SPRING, Season.SUMMER};

    String value();
}
