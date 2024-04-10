package com.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class log4jTest {
//    log4j自己的api 获取日志对象
//    需要修改下述代码  不推荐使用
//    private static final Logger LOGGER = Logger.getLogger(log4Test.class);
//    使用slf4j的api 获取日志对象 好处：如果更换日志的实现类 那么不需要修改代码
    private static final Logger LOGGER = LoggerFactory.getLogger(log4jTest.class);
    public static void main(String[] args) {

        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warn");
        LOGGER.error("error");
    }
}
