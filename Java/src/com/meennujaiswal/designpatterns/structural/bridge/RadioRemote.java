package com.meennujaiswal.designpatterns.structural.bridge;

public class RadioRemote implements IRemote {

	@Override
	public void turnOn() {
		System.out.println("Radio Turned ON!");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio Turned OFF!");
	}

	@Override
	public void setChannel(int frequency) {
		System.out.println("Radio frequency changed to " + frequency);
	}

}
