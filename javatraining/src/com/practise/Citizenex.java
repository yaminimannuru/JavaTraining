package com.practise;

public class Citizenex {
public static void main(String[] args) {
	int age = 18;
	boolean isCitizen = true;

	if (age >= 18) {
	    if (isCitizen) {
	        System.out.println("You are eligible to vote.");
	    } else {
	        System.out.println("You must be a citizen to vote.");
	    }
	} else {
	    System.out.println("You are not eligible to vote.");
	}
}
}
