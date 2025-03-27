package com.lq.app;

import com.lq.enums.TirePressures;

public class PrintEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TirePressures tp = TirePressures.valueOf("RR");
		tp.overridePressure(22);
		
		for (TirePressures t : TirePressures.values()) {
			System.out.printf("%s is %d pounds%n", t.getName(), t.getPressure());
		}

	}

}
