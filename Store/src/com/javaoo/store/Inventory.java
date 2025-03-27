package com.javaoo.store;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Inventory {
	
	public static void produceReport(Item[] items) {
		
		/*
		 * I T E M S   R E P O R T
		 * 
		 * +---------------+---------------+----------------------+
		 * TITLE			PRICE			QUANTITY
		 * +---------------+---------------+----------------------+
		 * 
		 * 
		 * 
		 * 
		 * +---------------+---------------+----------------------+
		 * 
		 * TOTAL NUMBER OF ITEMS...:
		 * 
		 * TOTAL VALUE $...........:
		 * 
		 */
		
		int totalQuantity = 0;
		double totalPrice = 0.0;
		
		System.out.println();
		System.out.println("I T E M S   R E P O R T");
		System.out.println();
		System.out.println("+--------------------------+---------------+----------------------+");
		System.out.println();
		
		for(int i = 0; i < items.length; i++) {
			
			if(items[i] != null) {
				System.out.println("TITLE.......:" + items[i].getTitle());
				System.out.println("PRICE.......:" + items[i].getPrice());
				System.out.println("QUANTITY....:" + items[i].getQuantity());
				
				if (items[i] instanceof ClassicalCD) {
					
					System.out.println("PERFORMERS..:");
					((ClassicalCD)items[i]).showPerformers();
				}
				
				System.out.println();
				
				totalQuantity += items[i].getQuantity();
				totalPrice += items[i].getPrice();	
			}
						
		}
		
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("+--------------------------+---------------+----------------------+");
		System.out.println();
		System.out.println("Total Number of Items...: " + totalQuantity);
		System.out.println();
		System.out.println("Total Value $...........: " + formatter.format(totalPrice));
		System.out.println();
	}

}
