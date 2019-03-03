package com.indian.andolan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class TeamPrimeryKey implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "EVENTID")
	private Long eventId;

	@Column(name = "MEMBERID")
	private Long memberId;

	/**
	 * 
	 */
	public TeamPrimeryKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param eventId
	 * @param memberId
	 */
	public TeamPrimeryKey(Long eventId, Long memberId) {
		super();
		this.eventId = eventId;
		this.memberId = memberId;
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
	 * @return the memberId
	 */
	public Long getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
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
		TeamPrimeryKey other = (TeamPrimeryKey) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{eventId:" + eventId + ", memberId:" + memberId + "}";
	}
	
	

}
