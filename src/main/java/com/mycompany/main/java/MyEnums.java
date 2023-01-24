package com.mycompany.main.java;

public enum MyEnums {
    ENUM1("Enum1"),
    ENUM2("Enum2"),
    ENUM3("Enum3"),
    ENUM4("Enum4");

    private String name;

    MyEnums(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        //return "MyEnums{" + "name='" + name + '\'' + '}';
        return name;
    }
}
