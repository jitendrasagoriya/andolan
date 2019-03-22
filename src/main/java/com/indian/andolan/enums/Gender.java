package com.indian.andolan.enums;

import java.util.HashMap;
import java.util.Map;

public enum Gender {
	
	MALE(1001,"MALE"),
	FEMALE(1002,"FEMALE"),
	LGBT(1003,"LGBT");
	
	private static final Map<Integer, Gender> byId = new HashMap<Integer, Gender>();
	private static final Map<String, Gender> byValue = new HashMap<String, Gender>();
	 
	
	static {
		  
	     for (Gender e : Gender.values() ) {
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
		 for (Gender e : Gender.values() ) {
			 map.put(e.id, e.value);
		 }
		return map;
	}
	public static Gender getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Gender getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private Gender(int id, String value) {
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
