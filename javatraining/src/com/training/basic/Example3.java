package com.training.basic;

import java.util.Scanner;

public class Example3 {

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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr first value");
		int a=sc.nextInt();
		System.out.println("enter the second value");
		int b=sc.nextInt();
		Example3 ex = new Example3();
		ex.sum(a,b);
		ex.minus(a,b);
		ex.multi(a,b);
		ex.div(a,b);
	}
}

