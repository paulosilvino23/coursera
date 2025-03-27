package com.lq.exercises;

public class Coffee {
	
	private int temperature;

	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	
	public Coffee(int temperature) {
		
		this();
		
		try {
			setTemperature(temperature);
		} catch (TooHotException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
			try {
				setTemperature(0);
			} catch (TooHotException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void setTemperature(int temperature) throws TooHotException {
		
		if(temperature > 120) {
			throw new TooHotException("The coffee is too hot");
		}
		
		this.temperature = temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}

}
