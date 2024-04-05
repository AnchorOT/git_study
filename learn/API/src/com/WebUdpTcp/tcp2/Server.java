package com.WebUdpTcp.tcp2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int b;
        while ((b=inputStream.read())!= -1){
            System.out.print((char) b);
        }
//        OutputStream outputStream = accept.getOutputStream();
//        outputStream.write("你好".getBytes(StandardCharsets.UTF_8));
//        outputStream.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("你好");
        bw.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
