package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class charStream4 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password= sc.next();
        FileWriter fw = new FileWriter("user.txt");
        fw.write(username);
        fw.write("\r\n"); //换行 windows \r\n ;Mac \r ;linux \n
        fw.write(password);
        fw.close();

    }
}
