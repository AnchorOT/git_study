package com.UUID;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String string = uuid.toString().replace("-","");
        System.out.println(string);
    }
}
