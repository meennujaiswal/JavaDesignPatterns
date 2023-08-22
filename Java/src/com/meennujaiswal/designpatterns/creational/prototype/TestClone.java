package com.meennujaiswal.designpatterns.creational.prototype;

public class TestClone implements Cloneable {
		
	static {
		System.out.println("I'm a static initialization block");
	}

	{
		System.out.println("I'm an instance initialization block");
	}
	
	public TestClone() {
		super();
		System.out.println("I'm the sub class constructor");
		setInstanceVariable("I'm the instance variable");
		System.out.println(getInstanceVariable());
	}
	
	private String instanceVariable;

	public String getInstanceVariable() {
		return instanceVariable;
	}

	public void setInstanceVariable(String instanceVariable) {
		this.instanceVariable = instanceVariable;
	}
	
	@Override
	public TestClone clone() {		
		try {
			return (TestClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
		
}

