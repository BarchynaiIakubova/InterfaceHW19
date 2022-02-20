package com.company;

public class Person {
    private String name;
    private byte age;
    private String memberShip;

    public Person(String name, byte age, String memberShip) {
        this.name = name;
        this.age = age;
        this.memberShip = memberShip;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge() {
        return age;
    }
    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }
    public String getMemberShip() {
        return memberShip;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", role in the family: " + memberShip;
    }
}

