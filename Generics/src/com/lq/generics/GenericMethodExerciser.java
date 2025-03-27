package com.lq.generics;

import static com.lq.generics.GenericMethod.*;
import static java.lang.System.*;

public class GenericMethodExerciser {
	
	public static void main(String[] args) {
		
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] chars = { 'a', 'b', 'c', 'd', 'e' };
		
		out.println("Integer array contains:");
		printArray(ints);
		out.println("Double array contains:");
		printArray(doubles);
		out.println("Character array contains:");
		printArray(chars);
	}

}
