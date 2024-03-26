package com.io;

import com.domain.User;

import java.io.*;
import java.util.ArrayList;
//加入一个容器中 直接读取一个容器
public class converted4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user1 = new User("alice","111");
        User user2 = new User("tom","122");
        User user3 = new User("lisa","131");
        User user4 = new User("kevin","123");
//        保存到本地
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        ArrayList<User> list2 = (ArrayList<User>) ois.readObject();
        for (User user : list2) {
            System.out.println(user);
        }
        ois.close();
    }
}
