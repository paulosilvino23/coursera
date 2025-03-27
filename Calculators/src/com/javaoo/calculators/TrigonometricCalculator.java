package com.javaoo.calculators;

public class TrigonometricCalculator extends BasicCalculator {
	
	public static final double sine(double v) {
		return Math.sin(v);
	}
	
	public static final double cosine(double v) {
		return Math.cos(v);
	}
	
	public static final double tangent(double v) {
		return Math.tan(v);
	}
	
	public static final double arcsine(double v) {
		return Math.asin(v);
	}

	public static final double arccosine(double v) {
		return Math.acos(v);
	}

	public static final double arctangent(double v) {
		return Math.atan(v);
	}

}
