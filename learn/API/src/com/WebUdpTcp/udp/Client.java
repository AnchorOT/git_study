package com.WebUdpTcp.udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String s = "gift for you";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int Port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName, Port);
        ds.send(dp);
        ds.close();
    }
}
