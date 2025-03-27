package com.lq.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(7, 6, 5);
		Box box2 = new Box(10);
		Box box3 = new Box(-5);
		
		System.out.println("Box 1 length is " + box1.getLength());
		System.out.println("Box 1 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());
		System.out.println();

		System.out.println("Box 2 length is " + box2.getLength());
		System.out.println("Box 2 width is " + box2.getWidth());
		System.out.println("Box 2 height is " + box2.getHeight());
		System.out.println();
		
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		
		System.out.println("Box 1 length is " + box1.getLength());
		System.out.println("Box 1 width is " + box1.getWidth());
		System.out.println("Box 1 height is " + box1.getHeight());
		System.out.println("Box 1`s volume is " + box1.getVolume());
		System.out.println("Box 1`s surface area is " + box1.getSurfaceArea());
		
		System.out.println();
		System.out.println("PRINTING THE BOX1's PRINTBOX() METHOD");
		box1.printBox();
		System.out.println();
		
		System.out.println();
		box1.setLength(-5);
		box1.setHeight(-5);
		box1.setWidth(-5);
		System.out.println();
		System.out.println("PRINTING THE BOX1's PRINTBOX() METHOD");
		box1.printBox();
		System.out.println();

		System.out.println();
		System.out.println("PRINTING THE BOX3's PRINTBOX() METHOD");
		box3.printBox();
		System.out.println();
	}

}
