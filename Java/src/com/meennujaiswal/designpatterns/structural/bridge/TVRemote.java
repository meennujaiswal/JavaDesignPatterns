package com.meennujaiswal.designpatterns.structural.bridge;

public class TVRemote implements IRemote{

	@Override
	public void turnOn() {
		System.out.println("TV Turned ON!");
	}

	@Override
	public void turnOff() {
		System.out.println("TV Turned OFF!");
	}

	@Override
	public void setChannel(int channel) {
		System.out.println("TV Channel changed to " + channel);
	}

}
