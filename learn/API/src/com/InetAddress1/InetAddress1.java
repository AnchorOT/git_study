package com.InetAddress1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("Anchor");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}
