package com.javaoo.calculators;

public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-------------------------------------------------------------------
		System.out.println("");
		System.out.println("BASIC CALCULATOR");
		
		double operation;
		
		operation = BasicCalculator.add(1, 3);
		System.out.println("1 + 3 = " + operation);
		
		operation = BasicCalculator.subtract(5, 3);
		System.out.println("5 - 3 = " + operation);
		
		operation = BasicCalculator.multiply(2, 3);
		System.out.println("2 * 3 = " + operation);
		
		operation = BasicCalculator.divide(9, 3);
		System.out.println("9 / 3 = " + operation);
		
		System.out.println("Setting last operation result in memory [MEMORY]");
		BasicCalculator.putValueInMemory(operation);
		
		operation = BasicCalculator.multiply(5, BasicCalculator.getValueFromMemory());
		System.out.println("5 * [MEMORY] = " + operation);
		
		//-------------------------------------------------------------------
		System.out.println("");
		System.out.println("SCIENTIFIC CALCULATOR");
		
		operation = ScientificCalculator.exp(2.2);
		System.out.println("EXP (2.2) = "+ operation);
		
		operation = ScientificCalculator.log(3);
		System.out.println("LOG 3 =" + operation);
		
		System.out.println("Setting last operation result in memory [MEMORY]");
		ScientificCalculator.putValueInMemory(operation);
		
		operation = ScientificCalculator.add(5, ScientificCalculator.getValueFromMemory());
		System.out.println("5 + [MEMORY] = " + operation);
		
		//-------------------------------------------------------------------
		System.out.println("");
		System.out.println("TRIGONOMETRIC CALCULATOR");
		
		operation = TrigonometricCalculator.sine(30);
		System.out.println("SINE(30) = " + operation);
		
		operation = TrigonometricCalculator.cosine(35);
		System.out.println("COSINE(35) = " + operation);
		
		operation = TrigonometricCalculator.tangent(50);
		System.out.println("TANGENT(50) = " + operation);
		
		operation = TrigonometricCalculator.arcsine(30);
		System.out.println("ARCSINE(30) = " + operation);
		
		operation = TrigonometricCalculator.arccosine(35);
		System.out.println("ARCCOSINE(35) = " + operation);
		
		operation = TrigonometricCalculator.arctangent(50);
		System.out.println("ARCTANGENT(50) = " + operation);
		
		System.out.println("Setting last operation result in memory [MEMORY]");
		TrigonometricCalculator.putValueInMemory(operation);
		
		operation = TrigonometricCalculator.add(3, TrigonometricCalculator.getValueFromMemory());
		System.out.println("3 + [MEMORY] = " + operation);
	}

}
