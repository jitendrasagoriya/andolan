package com.indian.andolan.enums;

import java.util.HashMap;
import java.util.Map;

public enum Status {
	
	INPROGRESS(2001,"INPROGRESS"),
	FINISH(2002,"FINISH"),
	SUSPEND(2003,"SUSPEND"),
	ONHOLD(2004,"ONHOLD");
	
	
	private static final Map<Integer, Status> byId = new HashMap<Integer, Status>();
	private static final Map<String, Status> byValue = new HashMap<String, Status>();
	 
	
	static {
		  
	     for (Status e : Status.values() ) {
	            if (byId.put(e.getId(), e) != null) {
	                throw new IllegalArgumentException("duplicate id: " + e.getId());
	            }
	            
	            if (byValue.put(e.getValue(), e) != null) {
	                throw new IllegalArgumentException("duplicate value: " + e.getValue());
	            }
	    }
	 }
	
	
	public static Status getById(int id) {
	    return byId.get(id);
	 }
	 
	public static Status getByValue(String value) {
		    return byValue.get(value);
	}
	
	private int id;
	
	private String value;

	/**
	 * @param id
	 * @param value
	 */
	private Status(int id, String value) {
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
