/**
 * 
 */
package com.lq.exercises;

/**
 * 
 */
public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int width;
		int height;
		int area;
		double radius = 10.0;
		double pi = 3.14;
		boolean result = true;
		
		int[] daysInMonths = new int[12];
		String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		
		width = 8;
		height = 12;
		area = 96;

		System.out.println("Hello World!");
		System.out.println();
		
		System.out.println("The value of width is "  + width);
		System.out.println("The value of height is " + height);
		System.out.println("The value of area is "   + area);
		System.out.println("The value of radius is " + radius);
		System.out.println("The value of pi is "     + pi);
		System.out.println("The value of result is " + result);
		System.out.println();
		
		daysInMonths[0] = 31;
		daysInMonths[1] = 28;
		daysInMonths[2] = 31;
		daysInMonths[3] = 30;
		daysInMonths[4] = 31;
		daysInMonths[5] = 30;
		daysInMonths[6] = 31;
		daysInMonths[7] = 31;
		daysInMonths[8] = 30;
		daysInMonths[9] = 31;
		daysInMonths[10] = 30;
		daysInMonths[11] = 31;
		
		for (int i = 0; i < daysInMonths.length; i++) {
			System.out.println(monthNames[i] + " has " + daysInMonths[i] + " days.");
		}
		
		System.out.println();
		
	}

}
