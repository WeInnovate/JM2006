package com.jm2006.learn.annotation.pre;

public class Ducati implements Bike {

	@Deprecated
	@Override
	public void startUsingKick() {
		System.out.println("Ducati started using Kick");
	}

	@Override
	public void move() {
		System.out.println("Ducati is moving...");
	}

	@Override
	public void stop() {
		System.out.println("Ducati stopped.");
	}

	@Override
	public void startUsingSelf() {
		System.out.println("Ducati started using self");
	}

}
