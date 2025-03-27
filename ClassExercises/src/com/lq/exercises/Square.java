package com.lq.exercises;

public class Square extends Rectangle {
	
	public Square(double side) {
		
		super(side, side);
	}

	public Square(double side, String name, String color) {
		
		this(side);
		this.setName(name);
		this.setColor(color);
	}
}
