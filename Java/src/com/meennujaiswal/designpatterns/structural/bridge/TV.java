package com.meennujaiswal.designpatterns.structural.bridge;

public class TV extends Device{
	
	private IRemote remote = new TVRemote() ;
	
	@Override
	public void turnOn() {
		System.out.println("Turning on the TV");
		remote.turnOn();
	}

	@Override
	public void turnOff() {
        System.out.println("Turning off the TV");	
        remote.turnOff();
	}

	@Override
	public void setChannel(int channel) {
		 System.out.println("Setting the TV channel to " + channel);
		 remote.setChannel(channel);
	}

}
