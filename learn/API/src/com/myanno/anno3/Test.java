package com.myanno.anno3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)//表示该注解的存活时间

public @interface Test {

}
