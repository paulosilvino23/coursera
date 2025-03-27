package com.lq.exercises;

public class ExerciseShapes {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[8];
		
		s[0] = new Rectangle(12, 12);
		s[1] = new Rectangle(15, 15);
		
		s[2] = new Square(12);
		s[3] = new Square(15);
		
		s[4] = new Cube(12);
		s[5] = new Cube(13);
		
		s[6] = new Box(11);
		s[7] = new Box(12, 13, 14);
		
		for(Shape shape : s) {
			
			shape.setColor("Black");
			
			System.out.println(shape.getColor());
			
//			ThreeDimensional temp = (ThreeDimensional)s[3];
//			System.out.println(temp.getVolume());
		}
		
		TwoDimensional[] twoDs = new TwoDimensional[3];
		
		twoDs[0] = new Circle(123.3);
		twoDs[1] = new Rectangle(12.3, 13.4);
		twoDs[2] = new Square(11.3);
				
		for(TwoDimensional td : twoDs) {
			System.out.println();
			System.out.println("AREA.......: " + td.getArea());
			System.out.println("PERIMETER..: " + td.getPerimeter());
			
		}
	}

}
