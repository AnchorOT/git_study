package com.WebUdpTcp.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        int b;
        while ((b=inputStream.read())!= -1){
            System.out.print((char) b);
        }
        inputStream.close();
        serverSocket.close();
    }
}
