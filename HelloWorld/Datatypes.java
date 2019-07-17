package com.anvitha.practice.examples;

public class Datatypes implements JavaInterface, Interface1 {
	
	

	int a = 10;
	float b = 1.5f;
	String c = "anu";
	boolean x = true;
	double d = 4.5;
	char e = 'a';
	short w = 3200;
	long r = 4567899023L;
	
	

	public void method() {
		System.out.println(ab);
		System.out.println(bc);
		System.out.println(cd);
	}

	public void method2() {
		System.out.println(t);
	}

	public static void main(String[] args) {

		Datatypes d = new Datatypes();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.x);
		System.out.println(d.d);
		System.out.println(d.e);
		System.out.println(d.w);
		System.out.println(d.r);

		d.method();
		d.method2();
	}

}
