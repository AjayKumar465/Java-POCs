package com.aj.nacre;

public class Test1 {
	/*
	 * static { System.out.println("staic"); }
	 * 
	 * { System.out.println("ns"); }
	 * 
	 * public Test1() { System.out.println("a"); }
	 */

	public static void main(String[] args) {
		Test1 t = new Test1();
		Vehicle bus=new RedBus();
		bus.Breaks();
	}
}

interface Vehicle {
	public void eng();

	public void Breaks();

}

abstract class Bus implements Vehicle {
	public void Breaks() {
		System.out.println("Bus has two Breaks");
	}
}

class RedBus extends Bus {
	public void engine() {
		System.out.println("RED Bus engine capacity 40KMph");
	}

	@Override
	public void eng() {
		System.out.println("red eng started");
	}
}
