package com.javaoo.store.drivers;

import java.util.TreeSet;

import com.javaoo.store.Artist;

import static java.lang.System.*;

public class ArtistExerciser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artist hotPlate = new Artist();
		
		TreeSet<String> instrumentals1 = new TreeSet<String>();
		instrumentals1.add("Piano");
		instrumentals1.add("Clarinet");
		instrumentals1.add("Hurdy Gurdy");
		instrumentals1.add("Tuba");
		
		hotPlate.addMember("Tom", instrumentals1);
		
		// ----------------------------------------------------------------------
		
		TreeSet<String> instrumentals2 = new TreeSet<String>();
		instrumentals2.add("Guitar");
		instrumentals2.add("Drums");
		instrumentals2.add("Saxophone");
		instrumentals2.add("Cello");
		
		hotPlate.addMember("Steve", instrumentals2);
		
		
		printMemberInstruments(hotPlate, "Tom");
		out.println();
		printMemberInstruments(hotPlate, "Steve");
		

	}
	
	private static void printMemberInstruments(Artist artist, String memberName) {
		
		out.println("HotPlate band member " + memberName + " plays:");
		for (String instrument : artist.getInstruments(memberName)) {
			out.println('\t' + instrument);
		}
	}

}
