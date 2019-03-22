package com.indian.andolan.enums;

import java.util.HashMap;
import java.util.Map;

public enum ParticipantType {

	STUDENTS(3001,"STUDENTS","STUDENTS"),
	GIRLS(3002,"GIRLS","GIRLS"),
	WOMEN(3003,"WOMEN","WOMEN"),
	KISHAN(3004,"KISHAN","KISHAN"),
	NGO(3005,"NGO","NGO"),
	DAILYWADGEWORKER(3006,"DAILYWADGEWORKER","DAILY WADGE WORKER"),
	PANTIONER(3007,"PANTIONER","PANTIONER"),
	RAILWAYEMPLOYEE(3008,"RAILWAYEMPLOYEE","RAILWAY EMPLOYEE"),
	AGANWADIWORKER(3009,"AGANWADIWORKER","AGAN WADI WORKER");
	
	
	private static final Map<Integer, ParticipantType> byId = new HashMap<Integer, ParticipantType>();
	private static final Map<String, ParticipantType> byValue = new HashMap<String, ParticipantType>();
	 
	
	static {
		  
	     for (ParticipantType e : ParticipantType.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	public static Map<Integer, String> getMap(){
		Map<Integer, String> map = new HashMap<>();
		 for (ParticipantType e : ParticipantType.values() ) {
			 map.put(e.id, e.value);
		 }
		return map;
	}
	
	public static ParticipantType getById(int id) {
	    return byId.get(id);
	 }
	 
	public static ParticipantType getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	private String value;
	
	private String name;

	/**
	 * @param id
	 * @param value
	 */
	private ParticipantType(int id, String value, String name) {
		this.id = id;
		this.value = value;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
}
