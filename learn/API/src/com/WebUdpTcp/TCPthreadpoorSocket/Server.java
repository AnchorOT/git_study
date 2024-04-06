package com.WebUdpTcp.TCPthreadpoorSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4,
                8,30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(6),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            Socket accept = serverSocket.accept();
            ThreadSocket th = new ThreadSocket(accept);
//            new Thread(th).start();
            pool.submit(th);
        }
//        serverSocket.close();
    }
}
