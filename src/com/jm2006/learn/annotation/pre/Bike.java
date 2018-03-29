package com.jm2006.learn.annotation.pre;

public interface Bike {

	@Deprecated
	public void startUsingKick();
	
	public void startUsingSelf();

	public void move();

	public void stop();
}
