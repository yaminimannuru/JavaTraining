package com.javatraining.pillar;

public class Constructorex {

	public Constructorex() { // Default constructor
		System.out.println("default constructor");
	}

	public Constructorex(String s) { // parametrized constructor
		System.out.println("parametrized constructor");
	}

	public Constructorex(int a, int b) {
		System.out.println("two parametrized constructor");
	}

	public static void main(String[] args) {
		Constructorex cn = new Constructorex();
		Constructorex c = new Constructorex("yamini");
		Constructorex ce = new Constructorex(10,12);
	}
}
