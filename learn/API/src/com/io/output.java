package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class output {
    public static void main(String[] args) throws IOException {
//        创建字节输出流的对象 告诉虚拟机要往那个文件写数据
//        FileOutputStream fos = new FileOutputStream("C:\\Java\\workplace\\1.txt");
        FileOutputStream fos = new FileOutputStream(new File("C:\\Java\\workplace\\1.txt"),true);//第二个参数为续写开关 默认false
//        写数据 如果文件不存在 会自动创建 存在 会清除文件
        fos.write(97);
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fos.write(97);
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        fos.write(97);
        fos.write("\r\n".getBytes(StandardCharsets.UTF_8));

        byte [] bys = {97,98,99};
        fos.write(bys);
        fos.write(bys,1,2);

//        释放资源
        fos.close();
    }
}
