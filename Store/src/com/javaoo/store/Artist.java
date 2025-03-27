package com.javaoo.store;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
	
	private String name;
	private SortedSet<String> memberNames;				// 20 elements
	private Map<String, SortedSet<String>> memberInstruments;			// 20 elements
	
	public Artist() {
		memberNames = new TreeSet<String>();
		memberInstruments = new TreeMap<String, SortedSet<String>>();
	}
	
	public Artist(String name) {
		this();
		this.name = name;
	}
	
	public Artist(String name, SortedSet<String> memberNames, Map<String, SortedSet<String>> memberInstruments) {
		this(name);
		this.memberNames = memberNames;
		this.memberInstruments = memberInstruments;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	public SortedSet<String> getMembers() {
		return memberNames;
	}
	
	public SortedSet<String> getInstruments(String memberName) {
		return memberInstruments.get(memberName);
	}
}
