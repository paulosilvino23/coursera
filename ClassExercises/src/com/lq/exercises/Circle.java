package com.lq.exercises;

public class Circle extends Shape implements TwoDimensional {
	
	private double radius;
	
	protected final double PI = 3.14159265359;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String name, String color) {
		
		this(radius);
		this.setName(name);
		this.setColor(color);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return PI * (Math.pow(this.getRadius(), 2));
	}

	@Override
	public double getPerimeter() {
		return 2 * PI * this.getRadius();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append(", color=");
		builder.append(getColor());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Circle [getRadius()=");
//		builder.append(getRadius());
//		builder.append("]");
//		return builder.toString();
//	}
	
	

}
