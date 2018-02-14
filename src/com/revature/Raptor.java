package com.revature;


public class Raptor extends Bird {
	static { System.out.println("r1");}
	public Raptor() {
		//super()
		System.out.println("Raptor");
		System.out.println("d2");
	}
	{System.out.println("r3");}
	static{System.out.println("r4");}
}
