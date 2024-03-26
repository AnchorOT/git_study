package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class properties3 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
//        prop.setProperty("江苏","南京");
//        prop.setProperty("安徽","南京");
//        prop.setProperty("山东","济南");
//        FileWriter fw = new FileWriter("a.txt");
//        prop.store(fw,"abc");//第二个参数为注释
        FileReader fr = new FileReader("a.txt");
        prop.load(fr);
        System.out.println(prop);

    }
}
