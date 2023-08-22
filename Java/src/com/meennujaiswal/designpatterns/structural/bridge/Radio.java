package com.meennujaiswal.designpatterns.structural.bridge;

public class Radio extends Device{
	
	private IRemote remote = new RadioRemote();
	
	@Override
	public void turnOn() {
		System.out.println("Turning on the Radio");
		remote.turnOn();
	}

	@Override
	public void turnOff() {
        System.out.println("Turning off the Radio");	
        remote.turnOff();
	}

	@Override
	public void setChannel(int frequency) {
		 System.out.println("Setting the Radio frequency to " + frequency);
		 remote.setChannel(frequency);
	}


}
