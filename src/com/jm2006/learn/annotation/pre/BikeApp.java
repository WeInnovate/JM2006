package com.jm2006.learn.annotation.pre;

public class BikeApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Ducati ducati = new Ducati();
		ducati.startUsingKick();
		ducati.move();
		ducati.stop();

		Pulsar pulsar = new Pulsar();
		pulsar.startUsingSelf();
		pulsar.move();
		pulsar.stop();
	}

}
