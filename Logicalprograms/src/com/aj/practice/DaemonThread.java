package com.aj.practice;

public class DaemonThread extends Thread {
	public DaemonThread() {
		setDaemon(true);
	}

	public void run() {
		System.out.println("run");
	}

	public static void main(String[] args) {
		DaemonThread ft = new DaemonThread();
		ft.start();
		System.out.println("is Daemon " + ft.isDaemon());
	}
}
