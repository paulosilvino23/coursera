package com.lq.exercises;

public class ExercisePrint {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Rectangle(10, 20, "Rectangle 1", "RED");
		
		shapes[1] = new Square(15, "Square 1", "BLUE");
		
		shapes[2] = new Cube(12, "Cube 1", "YELLOW");
		
		shapes[3] = new Box(12, 13, 15, "Box 1", "GREEN");
		
		shapes[4] = new Circle(15, "Circle 1", "BROWN");
		
		
		for(Shape shape: shapes) {
			System.out.println(shape);
		}

	}

}
