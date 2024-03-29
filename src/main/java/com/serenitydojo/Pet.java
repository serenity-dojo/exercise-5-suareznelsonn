package com.serenitydojo;

public abstract class Pet {

    private String name;
    private int age;

    // Constructor Method
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String makeNoise();

    // Abstract method to be implemented for each specific class
    public abstract String play();
}
