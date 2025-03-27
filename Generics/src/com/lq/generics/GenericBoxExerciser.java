package com.lq.generics;

import static java.lang.System.*;

public class GenericBoxExerciser {

	public static void main(String[] args) {
		
		GenericBox<Integer> genericInteger = new GenericBox<Integer>();
		GenericBox<String> genericString = new GenericBox<String>();
		
		genericString.setT("Hello World");
		genericInteger.setT(10);
		
		out.printf("%s" , genericString.getT());
		out.printf("%s" , genericInteger.getT());
		
	}
}
