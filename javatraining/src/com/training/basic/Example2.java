package com.training.basic;

public class Example2 {

	public void sum(int a, int b) {
		System.out.println(a + b);

	}

	public void minus(int a, int b) {
		System.out.println(a - b);
	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Example2 ex = new Example2();
		ex.sum(10, 5);
		ex.minus(10, 5);
		ex.multi(10, 5);
		ex.div(10, 5);
	}
}
