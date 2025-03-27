package com.lq.exercises;

public class Box extends Shape implements ThreeDimensional {
	
	private double height;
	private double width;
	private double length;
	
	protected final String HEIGHT = "Height";
	protected final String WIDTH = "Width";
	protected final String LENGTH = "Length";
	
	public Box(double height, double width, double length) {
		super();
		setHeight(height > 0 ? height : 1);
		setWidth(width > 0 ? width : 1);
		setLength(length > 0 ? length : 1);
	}
	
	public Box(double height, double width, double length, String name, String color) {
		
		this(height, width, length);
		this.setName(name);
		this.setColor(color);
	}
	
	public Box(double size) {
		this(size, size, size);
	}
	
	private boolean valueValidation(String name, double val) {
		if (val <= 0) {
			System.out.println(name + " must be greater than 0");
			return false;
		}
		
		return true;
	}
	
	protected boolean heightValidation(double val) {
		return valueValidation(HEIGHT, val);
	}
	
	protected boolean widthValidation(double val) {
		return valueValidation(WIDTH, val);
	}
	
	protected boolean lengthValidation(double val) {
		return valueValidation(LENGTH, val);
	}
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		
		if (!heightValidation(height))
			return;
		
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		
		if (!widthValidation(width))
			return;
		
		this.width = width;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		
		if (!lengthValidation(length))
			return;
		
		this.length = length;
	}
	
	public double getVolume() {
		return this.height * this.width * this.length;
	}
	
	public double getSurfaceArea() {
		return 2*(this.length * this.width) + 2*(this.length * this.height) + 2*(this.height * this.width);
	}
	
	public void printBox() {
		
		String msg = (this.getHeight() <= 0 || this.getLength() <= 0 || this.getWidth() <= 0)
				? "Invalid properties"
				: "Length = " + this.getLength() + "\rWidth = " + this.getWidth() + "\rHeight = " + this.getHeight() + "\rVolume = " + this.getVolume() + "\rSurface Area = " + this.getSurfaceArea();
	
		System.out.print(msg);
	}
	
	public static void main(String[] args) {
		
		Box b1 = new Box(10);
		Box b2 = new Box(10,20,30);
		
		System.out.println("BOX1");
		b1.printBox();
		
		System.out.println();
		System.out.println();
		
		System.out.println("BOX2");
		b2.printBox();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Box [height=");
		builder.append(height);
		builder.append(", width=");
		builder.append(width);
		builder.append(", length=");
		builder.append(length);
		builder.append(", color=");
		builder.append(getColor());
		builder.append(", name=");
		builder.append(getName());
		builder.append("]");
		return builder.toString();
	}

}
