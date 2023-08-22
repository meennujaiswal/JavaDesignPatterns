package com.meennujaiswal.designpatterns.creational.singleton;

public class CloneableSuperClass implements Cloneable{
	
	 @Override
	    protected Object clone()
	        throws CloneNotSupportedException
	    {
	        throw new CloneNotSupportedException();
	    }

}

class Singleton extends CloneableSuperClass{
		
	private static Singleton INSTANCE;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
	
	@Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }


}
