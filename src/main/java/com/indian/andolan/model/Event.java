package com.indian.andolan.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.indian.andolan.enums.EventType;

@Entity
@Table(name = "EVENT")
public class Event implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8026779251738346435L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_seq")
	@SequenceGenerator(name = "event_seq", sequenceName = "event_sequence", allocationSize = 20)
	@Column(name = "EVENTID")
	private Long eventId;

	@Column(name = "EVENTNAME")
	private String eventName;

	@Column(name = "EVENTPROBLEM")
	private String eventProblem;

	@Column(name = "CPMMITTEEORSTARTBY")
	private String committeeorstartby;

	@Column(name = "STATE")
	private String state;

	@Column(name = "CITY")
	private String city;

	@Column(name = "DISTRICT")
	private String district;

	@Column(name = "TALUKA")
	private String taluka;

	@Column(name = "EVENTDESCRIPTION")
	private String eventDescription;

	@Column(name = "NUMBEROFPARTICIPANTS")
	private String numberOfParticipants;

	@Column(name = "PARTICIPANTSTYPE")
	private String participantsType;

	@Column(name = "ADMIN")
	private String admins;

	@Column(name = "EMAILID")
	private String emailId;

	@Column(name = "MOBILENUMBER")
	private String mobileNumber;

	@Column(name = "EVENTLEADER")
	private String eventLeaders;

	@Column(name = "PARTYSUPPORTED")
	private String partySupported;

	@Column(name = "TYPE")
	private EventType type;

	@Column(name = "STARTDATE")
	private Timestamp startDate;

	@Column(name = "LASTUPDATE")
	private Timestamp lastUpdate;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(Long eventId, String eventName, String eventProblem, String committeeorstartby, String state,
			String city, String district, String taluka, String eventDescription, String numberOfParticipants,
			String participantsType, String admins, String emailId, String mobileNumber, String eventLeaders,
			String partySupported, EventType type, Timestamp startDate, Timestamp lastUpdate) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventProblem = eventProblem;
		this.committeeorstartby = committeeorstartby;
		this.state = state;
		this.city = city;
		this.district = district;
		this.taluka = taluka;
		this.eventDescription = eventDescription;
		this.numberOfParticipants = numberOfParticipants;
		this.participantsType = participantsType;
		this.admins = admins;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.eventLeaders = eventLeaders;
		this.partySupported = partySupported;
		this.type = type;
		this.startDate = startDate;
		this.lastUpdate = lastUpdate;
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
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the eventProblem
	 */
	public String getEventProblem() {
		return eventProblem;
	}

	/**
	 * @param eventProblem the eventProblem to set
	 */
	public void setEventProblem(String eventProblem) {
		this.eventProblem = eventProblem;
	}

	/**
	 * @return the committeeorstartby
	 */
	public String getCommitteeorstartby() {
		return committeeorstartby;
	}

	/**
	 * @param committeeorstartby the committeeorstartby to set
	 */
	public void setCommitteeorstartby(String committeeorstartby) {
		this.committeeorstartby = committeeorstartby;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the taluka
	 */
	public String getTaluka() {
		return taluka;
	}

	/**
	 * @param taluka the taluka to set
	 */
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	/**
	 * @return the eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * @param eventDescription the eventDescription to set
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	/**
	 * @return the numberOfParticipants
	 */
	public String getNumberOfParticipants() {
		return numberOfParticipants;
	}

	/**
	 * @param numberOfParticipants the numberOfParticipants to set
	 */
	public void setNumberOfParticipants(String numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}

	/**
	 * @return the participantsType
	 */
	public String getParticipantsType() {
		return participantsType;
	}

	/**
	 * @param participantsType the participantsType to set
	 */
	public void setParticipantsType(String participantsType) {
		this.participantsType = participantsType;
	}

	/**
	 * @return the admins
	 */
	public String getAdmins() {
		return admins;
	}

	/**
	 * @param admins the admins to set
	 */
	public void setAdmins(String admins) {
		this.admins = admins;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the eventLeaders
	 */
	public String getEventLeaders() {
		return eventLeaders;
	}

	/**
	 * @param eventLeaders the eventLeaders to set
	 */
	public void setEventLeaders(String eventLeaders) {
		this.eventLeaders = eventLeaders;
	}

	/**
	 * @return the partySupported
	 */
	public String getPartySupported() {
		return partySupported;
	}

	/**
	 * @param partySupported the partySupported to set
	 */
	public void setPartySupported(String partySupported) {
		this.partySupported = partySupported;
	}

	/**
	 * @return the type
	 */
	public EventType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(EventType type) {
		this.type = type;
	}

	/**
	 * @return the startDate
	 */
	public Timestamp getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the lastUpdate
	 */
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((admins == null) ? 0 : admins.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((committeeorstartby == null) ? 0 : committeeorstartby.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((eventDescription == null) ? 0 : eventDescription.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventLeaders == null) ? 0 : eventLeaders.hashCode());
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
		result = prime * result + ((eventProblem == null) ? 0 : eventProblem.hashCode());
		result = prime * result + ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((numberOfParticipants == null) ? 0 : numberOfParticipants.hashCode());
		result = prime * result + ((participantsType == null) ? 0 : participantsType.hashCode());
		result = prime * result + ((partySupported == null) ? 0 : partySupported.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((taluka == null) ? 0 : taluka.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Event other = (Event) obj;
		if (admins == null) {
			if (other.admins != null)
				return false;
		} else if (!admins.equals(other.admins))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (committeeorstartby == null) {
			if (other.committeeorstartby != null)
				return false;
		} else if (!committeeorstartby.equals(other.committeeorstartby))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (eventDescription == null) {
			if (other.eventDescription != null)
				return false;
		} else if (!eventDescription.equals(other.eventDescription))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventLeaders == null) {
			if (other.eventLeaders != null)
				return false;
		} else if (!eventLeaders.equals(other.eventLeaders))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		if (eventProblem == null) {
			if (other.eventProblem != null)
				return false;
		} else if (!eventProblem.equals(other.eventProblem))
			return false;
		if (lastUpdate == null) {
			if (other.lastUpdate != null)
				return false;
		} else if (!lastUpdate.equals(other.lastUpdate))
			return false;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (numberOfParticipants == null) {
			if (other.numberOfParticipants != null)
				return false;
		} else if (!numberOfParticipants.equals(other.numberOfParticipants))
			return false;
		if (participantsType == null) {
			if (other.participantsType != null)
				return false;
		} else if (!participantsType.equals(other.participantsType))
			return false;
		if (partySupported == null) {
			if (other.partySupported != null)
				return false;
		} else if (!partySupported.equals(other.partySupported))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (taluka == null) {
			if (other.taluka != null)
				return false;
		} else if (!taluka.equals(other.taluka))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{eventId:" + eventId + ", eventName:" + eventName + ", eventProblem:" + eventProblem
				+ ", committeeorstartby:" + committeeorstartby + ", state:" + state + ", city:" + city + ", district:"
				+ district + ", taluka:" + taluka + ", eventDescription:" + eventDescription + ", numberOfParticipants:"
				+ numberOfParticipants + ", participantsType:" + participantsType + ", admins:" + admins + ", emailId:"
				+ emailId + ", mobileNumber:" + mobileNumber + ", eventLeaders:" + eventLeaders + ", partySupported:"
				+ partySupported + ", type:" + type + ", startDate:" + startDate + ", lastUpdate:" + lastUpdate + "}";
	}

}
