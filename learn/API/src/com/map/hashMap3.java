package com.map;

import com.domain.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap3 {
    public static void main(String[] args) {
        HashMap<Student, String> hashmap = new HashMap<>();
        Student s1 = new Student("tom", 18);
        Student s2 = new Student("alice", 17);
        Student s3 = new Student("jerry", 19);
        Student s4 = new Student("kevin", 19);
        hashmap.put(s1, "shanxi");
        hashmap.put(s2, "shanghai");
        hashmap.put(s3, "beijing");
        Set<Student> keys = hashmap.keySet();
        for (Student key : keys) {
            String value = hashmap.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("\n");
        Set<Map.Entry<Student, String>> entries = hashmap.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
        System.out.println("\n");
        hashmap.forEach(
                (Student key, String value) -> {
                    System.out.println(key + "---" + value);
                }
        );
    }
}
