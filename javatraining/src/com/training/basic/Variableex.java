package com.training.basic;


public class Variableex {

	// datatype variable = value
	public static int globalVariable = 10;

	public static void main(String[] args) {
		// This is a local variable
		int localVariable = 20;

		System.out.println("Local variable: " + localVariable);
		System.out.println("Global variable: " + globalVariable);

		System.out.println(globalVariable + localVariable );
	}
	public void run() {
		//System.out.println(globalVariable + localVariable );
		//System.out.println("Local variable: " + a);
		//System.out.println("Global variable: " + globalVariable);
	}
	
}
