package com.thaiprogramer.ooplab;

public class testEnum {
	enum Status {
		HEALTHY,
		SLEEPY,
		DEAD
	}
	public static void main(String[] args ) {
		Status myStatus = Status.HEALTHY;
		
		switch (myStatus) {
		case HEALTHY: 
			System.out.println("GO GO GO");
			break;
		case SLEEPY:
			System.out.println("ZZZZ");
			break;
		default: 
			System.out.println("none");

		
		}
		

	
	}
}
