package com.javaoo.store.drivers;

import java.util.Date;

import com.javaoo.store.Artist;
import com.javaoo.store.Book;
import com.javaoo.store.CD;
import com.javaoo.store.ClassicalCD;
import com.javaoo.store.Inventory;
import com.javaoo.store.Item;

public class InventoryDriver {
	
	public static void main(String[] args) {
		
		Item[] myInventory = new Item[50];
		
		// Adding some Books
		
		myInventory[0] = new Book("I Love You: Recipes from the Heart",
				24.50, 7, "Pamela Anderson", "Voracious", "Cooking");
		
		myInventory[1] = new Book("Simple Recipes to Empower Your Body and Feed Your Soul",
				14.91, 8, "Gisele Bündchen", "Clarkson Potter", "Cooking");
		
		myInventory[2] = new Book("World War II: The Definitive Visual History from Blitzkrieg to the Atom Bomb",
				17.12, 6, "DK", "DK", "History");
		
		myInventory[3] = new Book("The Bible: A Global History",
				29.52, 15, "Bruce Gordon", "Basic Books", "History");
		
		myInventory[4] = new Book("My Magical Foods - Get Picky Eaters to Choose Veggies and Fruits",
				14.99, 11, "Becky Cummings", "Free Kids Press", "Children");
		
		
		// Adding some CDs
		
		myInventory[5] = new CD("Led Zeppelin: The Song Remains the Same",
				12.0, 6, new Artist("Led Zeppelin"), new Date("01/01/2024"));
		
		myInventory[6] = new CD("R.E.M. - Perfect Square",
				3.41, 7, new Artist("R.E.M."), new Date("01/01/2024"));
		
		myInventory[7] = new CD("Beatles: From Liverpool to San Francisco",
				18.13, 5, new Artist("Beatles"), new Date("01/01/2024"));
		
		
		// Adding some Classical CDs
		
		String[] performersA = {"Raul","Jonh","Ralph"};
		myInventory[8] = new ClassicalCD("The Journey: A Music Special From Andrea Bocelli", 
							24.20, 
							11, 
							"Andrea Bocelli", 
							performersA,
							"Brazil",
							new Date(01/01/2024));
		
		String[] performersB = {"Jack","Ronald","Mary"};
		myInventory[9] = new ClassicalCD("Back To Black", 
							247.90, 
							8, 
							"Amy Winehouse", 
							performersB,
							"UK",
							new Date(01/01/2016));
		
		//
		
		Inventory.produceReport(myInventory);
	}

}
