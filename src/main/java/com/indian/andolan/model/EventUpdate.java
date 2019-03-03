package com.indian.andolan.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.indian.andolan.enums.Status;


@Entity
@Table(name = "EVENTUPDATE")
public class EventUpdate implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EVENTUPDATEID")
	private Long eventUpdateId;
	
	@Column(name = "EVENTID")
	private Long eventId;
	
	@Column(name = "DATE")
	private Timestamp date;
	
	@Column(name = "HEADING")
	private String heading;
	
	@Column(name = "CURRENTUPDATE")
	private String currentUpdate;
	
	@Column(name = "CURRENTCITY")
	private String currentCity;
	
	@Column(name = "CURRENTSTATE")
	private String currentState;	
	
	@Column(name = "STATUS")
	private Status status;

	/**
	 * 
	 */
	public EventUpdate() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param eventUpdateId
	 * @param eventId
	 * @param date
	 * @param heading
	 * @param currentUpdate
	 * @param currentCity
	 * @param currentState
	 * @param status
	 */
	public EventUpdate(Long eventUpdateId, Long eventId, Timestamp date, String heading, String currentUpdate,
			String currentCity, String currentState, Status status) {
		super();
		this.eventUpdateId = eventUpdateId;
		this.eventId = eventId;
		this.date = date;
		this.heading = heading;
		this.currentUpdate = currentUpdate;
		this.currentCity = currentCity;
		this.currentState = currentState;
		this.status = status;
	}


	/**
	 * @param eventId
	 * @param date
	 * @param heading
	 * @param currentUpdate
	 * @param currentCity
	 * @param currentState
	 * @param status
	 */
	public EventUpdate(Long eventId, Timestamp date, String heading, String currentUpdate, String currentCity,
			String currentState, Status status) {
		super();
		this.eventId = eventId;
		this.date = date;
		this.heading = heading;
		this.currentUpdate = currentUpdate;
		this.currentCity = currentCity;
		this.currentState = currentState;
		this.status = status;
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
	 * @return the date
	 */
	public Timestamp getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Timestamp date) {
		this.date = date;
	}

	/**
	 * @return the heading
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * @param heading the heading to set
	 */
	public void setHeading(String heading) {
		this.heading = heading;
	}

	/**
	 * @return the currentUpdate
	 */
	public String getCurrentUpdate() {
		return currentUpdate;
	}

	/**
	 * @param currentUpdate the currentUpdate to set
	 */
	public void setCurrentUpdate(String currentUpdate) {
		this.currentUpdate = currentUpdate;
	}

	/**
	 * @return the currentCity
	 */
	public String getCurrentCity() {
		return currentCity;
	}

	/**
	 * @param currentCity the currentCity to set
	 */
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	/**
	 * @return the currentState
	 */
	public String getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentCity == null) ? 0 : currentCity.hashCode());
		result = prime * result + ((currentState == null) ? 0 : currentState.hashCode());
		result = prime * result + ((currentUpdate == null) ? 0 : currentUpdate.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventUpdateId == null) ? 0 : eventUpdateId.hashCode());
		result = prime * result + ((heading == null) ? 0 : heading.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		EventUpdate other = (EventUpdate) obj;
		if (currentCity == null) {
			if (other.currentCity != null)
				return false;
		} else if (!currentCity.equals(other.currentCity))
			return false;
		if (currentState == null) {
			if (other.currentState != null)
				return false;
		} else if (!currentState.equals(other.currentState))
			return false;
		if (currentUpdate == null) {
			if (other.currentUpdate != null)
				return false;
		} else if (!currentUpdate.equals(other.currentUpdate))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
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
		if (heading == null) {
			if (other.heading != null)
				return false;
		} else if (!heading.equals(other.heading))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{ eventUpdateId:" + eventUpdateId + " eventId:" + eventId + ", date:" + date + ", heading:" + heading + ", currentUpdate:"
				+ currentUpdate + ", currentCity:" + currentCity + ", currentState:" + currentState + ", status:"
				+ status + "}";
	}
	
	

}
