package com.io;

import com.domain.User;

import java.io.*;

public class converted2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user1 = new User("alice","111");
        User user2 = new User("tom","122");
        User user3 = new User("lisa","131");
        User user4 = new User("kevin","123");
//        保存到本地
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(user1);
        oos.writeObject(user2);
        oos.writeObject(user3);
        oos.writeObject(user4);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Object obj ;
        while (true){
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (IOException e) {
                break;
            }

        }
        ois.close();
    }
}
