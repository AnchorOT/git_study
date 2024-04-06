package com.WebUdpTcp.tcp3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket accept = serverSocket.accept();
            ThreadSocket th = new ThreadSocket(accept);
            new Thread(th).start();
        }
//        serverSocket.close();
    }
}
