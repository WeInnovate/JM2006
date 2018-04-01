package com.jm2006.learn.annotation.pre;

public class Pulsar implements Bike {

	@Deprecated
	@Override
	public void startUsingKick() {
		System.out.println(this.getClass().getSimpleName()+" started using Kick");
	}

	@Override
	public void move() {
		System.out.println("Pulsar is moving...");
	}

	@Override
	public void stop() {
		System.out.println("Pulsar stopped.");
	}

	@Override
	public void startUsingSelf() {
		System.out.println("Pulsar started using self");
	}

}
