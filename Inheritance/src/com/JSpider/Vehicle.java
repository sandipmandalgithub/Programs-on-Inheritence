package com.JSpider;
// MULTI-LEVEL INHERITANCE IN JAVA

public class Vehicle {
	void start() {
		System.out.println("starting...........");
	}
	void stop() {
		System.out.println("stopped............");
	}

}

class Bike extends Vehicle{
	void kickStart() {
		System.out.println("starting with kick...........");
	}
	void kickStop() {
		System.out.println("kickstopped........");
	}
}

class Car extends Bike{
	void playMusic() {
		System.out.println("start the music.........");
	}
	void giveBreak() {
		System.out.println("givebreak................");
	}

		
	}

