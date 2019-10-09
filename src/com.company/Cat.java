package com.company;

public class Cat {
    String color;
String name;
int height;

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Cat(String color, String name, int height) {
        this.color = color;
        this.name = name;
        this.height = height;
    }
}
