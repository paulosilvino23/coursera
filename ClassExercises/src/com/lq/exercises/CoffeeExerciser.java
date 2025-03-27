package com.lq.exercises;

public class CoffeeExerciser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee coffee = null;
		
//		try {
//			coffee = new Coffee(125);
//		} catch (TooHotException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Coffee is set to " + coffee.getTemperature());
//		}
		
		coffee = new Coffee(125);
		
		System.out.println("Coffee is set to " + coffee.getTemperature());

	}

}
