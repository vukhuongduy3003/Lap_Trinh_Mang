package com.vn.entity;

public class Person {
    private String name;
    private Integer age;
    private String profession;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.profession = new String("Unemployed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void displayPersion() {
        System.out.print("name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'');
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'';
    }
}
