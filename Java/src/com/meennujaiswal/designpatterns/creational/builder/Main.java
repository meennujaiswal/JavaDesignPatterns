package com.meennujaiswal.designpatterns.creational.builder;

import java.time.Duration;

public class Main {
	
	public static void main(String[] args) {
		Employee employee = new EmployeeBuilder().setFirstName("Meenu")
												 .setLastName("Jaiswal")
												 .build();
		
		StringBuilder string = new StringBuilder("test");
		string.append('a')
		.append(false);
		
		Duration duration = Duration.ofDays(2)
									.minusDays(1);
		
		
	}

}
