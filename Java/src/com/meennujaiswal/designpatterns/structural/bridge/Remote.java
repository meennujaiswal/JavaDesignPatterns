package com.meennujaiswal.designpatterns.structural.bridge;

public class Remote {

	public void turnOn() {
		System.out.println("Turned ON!");
	}

	public void turnOff() {
		System.out.println("Turned OFF!");
	}

	public void setChannel(int channel) {
		System.out.println("Channel changed to "+ channel);
	}

}
