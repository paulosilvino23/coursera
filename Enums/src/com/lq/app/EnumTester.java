package com.lq.app;

import com.lq.enums.TirePressures;

public class EnumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(TirePressures t : TirePressures.values()) {
			
			System.out.println(t + " " + t.getPressure());
		}

	}

}
