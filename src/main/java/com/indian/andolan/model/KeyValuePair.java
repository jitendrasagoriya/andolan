package com.indian.andolan.model;

import java.io.Serializable;

public class KeyValuePair implements Serializable,Comparable<KeyValuePair>  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public long id;
	
	public String name;

	/**
	 * 
	 */
	public KeyValuePair() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param number
	 * @param name
	 */
	public KeyValuePair(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValuePair other = (KeyValuePair) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "KeyValuePair [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(KeyValuePair o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
 
	

}
