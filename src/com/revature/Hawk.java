package com.revature;

public class Hawk extends Raptor {
	public static void main(String[] args) {
		System.out.println("init");
		new Hawk();
		new Hawk();
		System.out.println("hawk");
		new Hawk(); 
		System.out.println("MERGE CONFLICT");
	}
	public Hawk() {
		//super();
	}
}
