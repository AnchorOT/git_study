package com.WebUdpTcp.udpBroadCast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String s = "gift for you";
        byte[] bytes = s.getBytes();
        InetAddress byName = InetAddress.getByName("255.255.255.255");
        int Port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName, Port);
        ds.send(dp);
        ds.close();
    }
}
