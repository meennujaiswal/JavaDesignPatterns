package com.meennujaiswal.designpatterns.creational.prototype;

public class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;
    
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person clonedPerson = (Person) super.clone();
        clonedPerson.address = address.clone();
        return clonedPerson;
    }
}

