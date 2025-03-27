package com.lq.exercises;

public class Rectangle extends Shape implements TwoDimensional {
	
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		this.setName("Unknow");
		this.setColor("White");
	}
	
	public Rectangle(double length, double width, String name, String color) {
		
		this(length, width);
		this.setName(name);
		this.setColor(color);
	}
	
	public double getArea() {
		return this.getLength() * this.getWidth();
	}
	
	public double getPerimeter() {
		return 2 * (this.getLength() + this.getWidth());
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rectangle [length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", color=");
		builder.append(getColor());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}
	
}
