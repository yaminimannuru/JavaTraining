package com.training.accessspecifiers;

public class Returntypeex {
	public void run() {
		System.out.println("we need to run in marathoon");
	}

	public String race() {
		return "race championship";
	}

	public int ground() {
		return 10;
	}

	public static void main(String[] args) {
		Returntypeex r = new Returntypeex();
		r.run();
		System.out.println(r.race());
		r.race();
		r.ground();
		System.out.println(r.ground());
	}
}
