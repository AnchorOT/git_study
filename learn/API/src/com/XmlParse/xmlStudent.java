package com.XmlParse;

public class xmlStudent {
    private String id;
    private String name;
    private int age;

    public xmlStudent() {
    }

    public xmlStudent(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "xmlStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
