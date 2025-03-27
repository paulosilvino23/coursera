package com.lq.generics;

import static java.lang.System.*;

public class GenericMethod {
	
	public static <E> void printArray(E[] inputArray) {
		
		for (E element : inputArray) {
			out.printf("%s", element);
		}
		out.println();
	}
}
