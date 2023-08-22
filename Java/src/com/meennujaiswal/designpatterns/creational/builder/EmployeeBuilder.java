package com.meennujaiswal.designpatterns.creational.builder;

public class EmployeeBuilder {
	
	private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;
    
    public EmployeeBuilder setFirstName(String firstName) {
    	this.firstName = firstName;
    	return this;
    }
    
    public EmployeeBuilder setLastName(String lastName) {
    	this.lastName = lastName;
    	return this;
    }
    
    public EmployeeBuilder setAge(int age) {
    	this.age = age;
    	return this;
    }
    
    public EmployeeBuilder setAddress(String address) {
    	this.address = address;
    	return this;
    }
    
    public EmployeeBuilder setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    	return this;
    }
    
    public Employee build() {
    	return new Employee(firstName, lastName, age, address, phoneNumber);
    }
	
}

