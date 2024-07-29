package com.fwatanabe.patterns.singleton.logger;

public class Logger implements Cloneable {

	private static volatile Logger instance;

	private Logger() {
	}

	public static synchronized Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) {
		System.out.println(message);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}