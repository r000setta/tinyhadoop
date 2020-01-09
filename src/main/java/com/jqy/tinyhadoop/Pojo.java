package com.jqy.tinyhadoop;

import java.io.Serializable;

public class Pojo implements Serializable {
    private static final long serialVersionUID = 876323262645176354L;
    private String name;
    private int age;

    public Pojo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
