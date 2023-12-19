package com.javatraining.pillar;

//Acquring the property of a parent class to child class called inheritance
public class Inheritanceexx {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("creation of a car");
		c.ac();
		c.brake();
		c.seater();
		c.wheel();

		Bike b = new Bike();
		System.out.println("creation of a bike");
		b.brake();
		b.clutch();
		b.seat();
		b.wheel();
	}

}
