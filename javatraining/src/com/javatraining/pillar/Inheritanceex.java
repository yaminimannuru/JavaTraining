
package com.javatraining.pillar;

public class Inheritanceex extends Abstractex {

	@Override
	public void addproduct(int a) {
		System.out.println("add product"); // TODO Auto-generated method stub

	}

	@Override
	public void deleteproduct(String s) {
		System.out.println("deleteproduct");// TODO Auto-generated method stub

	}

	@Override
	public void getproduct() {
		System.out.println("getproduct");// TODO Auto-generated method stub

	}

	@Override
	public void updateproduct() {
		System.out.println("updateproduct");// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Inheritanceex in = new Inheritanceex();
		in.addproduct(11);
		in.deleteproduct("hello java");
		in.getproduct();
		in.updateproduct();
	}

}
