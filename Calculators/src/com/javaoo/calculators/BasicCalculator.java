package com.javaoo.calculators;

public class BasicCalculator {
	
	private static double holdValue;
	
	public static final void putValueInMemory(double v) {
		holdValue = v;
	}
	
	public static final double getValueFromMemory() {
		return holdValue;
	}
	
	// Operation methods
	
	public static final double add(double v1, double v2) {
		return v1 + v2;
	}
	
	public static final double subtract(double v1, double v2) {
		return v1 - v2;
	}
	
	public static final double multiply(double v1, double v2) {
		return v1 * v2;
	}
	
	public static final double divide(double v1, double v2) {
		return v1 / v2;
	}
	
}
