package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
	
	private String composer;
	private String[] performers;			// 5 elements
	private String recordingLocation;
	private Date releaseDate;
	
	private int performerCount;
	
	public ClassicalCD() {
		this.performerCount = 0;
	}
	
	
	
	public ClassicalCD(String title, double price, int quantity,
			String composer, String[] performers, String recordingLocation, Date releaseDate) {
		
		super(title, price, quantity);
		
		this.composer = composer;
		this.recordingLocation = recordingLocation;
		this.releaseDate = releaseDate;
		this.performers = new String[5];
		
		for (int i = 0; i < performers.length; i++) {
			this.addPerformer(performers[i]);
		}
	}



	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void addPerformer(String performer) {
		
		boolean slotAvailable = false;
		
		for (int i = 0; i < this.performers.length; i++) {
			if (this.performers[i] == null || this.performers[i].isEmpty()) {
				slotAvailable = true;
				this.performers[i] = performer;
				performerCount++;
				break;
			}
		}
		
		if (!slotAvailable) {
			System.out.println("WARNING: no slot available");
		}
	}
	
	public void showPerformers() {
		
		for (int i = 0; i < performerCount; i++) {
			System.out.println(i + "-" + performers[i]);
		}
	}
}
