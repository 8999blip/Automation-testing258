package com.tka;


public class A<WebDriver> {
	public void m1() {
		D dd = new D();
		dd.m4();
		
		System.out.println("A -m1");
	}
	
	public static void main(String[] args) {
		B bb =new B();
		bb.m2();
	}

}
