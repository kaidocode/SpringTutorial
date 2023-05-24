package com.example.demoApp.model;

public class Person {
    private Long id;
    private String Fname;
    private int age;

    public Person(Long id, String fname, int age) {
        this.id = id;
        Fname = fname;
        this.age = age;
    }

    public Person(){
        super();
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
