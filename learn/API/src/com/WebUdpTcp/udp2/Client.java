package com.WebUdpTcp.udp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("886")){
                break;
            }
            byte[] bytes = s.getBytes();
            InetAddress byName = InetAddress.getByName("127.0.0.1");
            int Port = 10000;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName, Port);
            ds.send(dp);
        }
        ds.close();
    }
}
