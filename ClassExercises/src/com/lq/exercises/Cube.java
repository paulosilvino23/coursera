package com.lq.exercises;

public class Cube extends Box {
	
	public Cube(double side) {
		super(side);
	}
	
	public Cube(double side, String name, String color) {
		
		this(side);
		this.setName(name);
		this.setColor(color);
	}

	@Override
	public void setHeight(double height) {
		
		if (!heightValidation(height))
			return;
		
		if(height != super.getHeight()) {
			super.setHeight(height);
			super.setLength(height);
			super.setWidth(height);
		}
	}

	@Override
	public void setWidth(double width) {
		
		if (!widthValidation(width))
			return;
		
		if(width != super.getWidth()) {
			super.setHeight(width);
			super.setLength(width);
			super.setWidth(width);
		}
	}

	@Override
	public void setLength(double length) {
		
		if (!lengthValidation(length))
			return;
		
		if(length != super.getLength()) {
			super.setHeight(length);
			super.setLength(length);
			super.setWidth(length);
		}
	}
	
	public double getSide() {
		return super.getHeight();
	}
	
	public void setSide(double side) {
		setHeight(side);
	}

}
