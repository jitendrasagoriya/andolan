package com.indian.andolan.enums;

import java.util.HashMap;
import java.util.Map;

public enum EventType {
	
	STUDENTS(3001,"STUDENTS"),
	GIRLS(3002,"GIRLS"),
	WOMEN(3003,"WOMEN"),
	KISHAN(3004,"KISHAN"),
	STRIK(3005,"STRIK"),
	GHERAW(3006,"GHERAW"),
	HUMANCHAIN(3007,"HUMANCHAIN"),
	MARCH(3008,"MARCH"),
	HUNGERSTRIK(3009,"HUNGERSTRIK");
	
	
	private static final Map<Integer, EventType> byId = new HashMap<Integer, EventType>();
	private static final Map<String, EventType> byValue = new HashMap<String, EventType>();
	 
	
	static {
		  
	     for (EventType e : EventType.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static EventType getById(int id) {
	    return byId.get(id);
	 }
	 
	public static EventType getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private EventType(int id, String value) {
		this.id = id;
		this.value = value;
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
