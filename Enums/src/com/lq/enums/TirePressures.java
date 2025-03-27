package com.lq.enums;

public enum TirePressures {

	LF(30, "Left Front"),
	RF(30, "Right Front"),
	LR(32, "Left Rear"),
	RR(32, "Right Rear");
	
	private int pressure;
	private String name;
	
	private TirePressures(int pressure, String name) {
		this.pressure = pressure;
		this.name = name;
	}

	/**
	 * @return the pressure
	 */
	public int getPressure() {
		return pressure;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public void overridePressure(int pressure) {
		this.pressure = pressure;
	}
}
