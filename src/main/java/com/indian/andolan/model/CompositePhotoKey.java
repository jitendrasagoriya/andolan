package com.indian.andolan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompositePhotoKey implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "EVENTID")
	private Long eventId;
	
	@Column(name = "EVENTUPDATEID")
	private Long eventUpdateId;

	/**
	 * 
	 */
	public CompositePhotoKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param eventId
	 * @param eventUpdateId
	 */
	public CompositePhotoKey(Long eventId, Long eventUpdateId) {
		super();
		this.eventId = eventId;
		this.eventUpdateId = eventUpdateId;
	}

	/**
	 * @return the eventId
	 */
	public Long getEventId() {
		return eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	/**
	 * @return the eventUpdateId
	 */
	public Long getEventUpdateId() {
		return eventUpdateId;
	}

	/**
	 * @param eventUpdateId the eventUpdateId to set
	 */
	public void setEventUpdateId(Long eventUpdateId) {
		this.eventUpdateId = eventUpdateId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventUpdateId == null) ? 0 : eventUpdateId.hashCode());
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
		CompositePhotoKey other = (CompositePhotoKey) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventUpdateId == null) {
			if (other.eventUpdateId != null)
				return false;
		} else if (!eventUpdateId.equals(other.eventUpdateId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{eventId:" + eventId + ", eventUpdateId:" + eventUpdateId + "}";
	}
	
	
	
}
