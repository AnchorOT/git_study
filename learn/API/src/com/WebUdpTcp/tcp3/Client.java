package com.WebUdpTcp.tcp3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("API\\1.png"));

        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
//        BufferedOutputStream bos2 = new BufferedOutputStream(new FileOutputStream("API\\111.png"));
        int b;
//        while ((b = bis1.read(bytes)) != -1) {
//            bos2.write(bytes,0, b);
//        }
//        bos2.flush();
//        bos2.close();
        while ((b = bis1.read()) != -1) {
            bos.write(b);
        }
        socket.shutdownOutput();//仅仅关闭输出流，对socket没有影响
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        bis1.close();
        socket.close();
    }
}
