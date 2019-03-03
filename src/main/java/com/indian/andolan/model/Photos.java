/**
 * 
 */
package com.indian.andolan.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author JITENDRA SAGORIYA
 *
 */

@Entity
@Table(name = "PHOTOS" )
public class Photos implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long photoId;

	@Column(name = "EVENTID")
	private Long eventId;
	
	@Column(name = "EVENTUPDATEID")
	private Long eventUpdateId;
	
	@Column(name = "PHOTO")
	private String photo;
	
	@Column(name = "DATE")
	private Timestamp date;

	/**
	 * 
	 */
	public Photos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param photoId
	 * @param eventId
	 * @param eventUpdateId
	 * @param photo
	 * @param date
	 */
	public Photos(Long photoId, Long eventId, Long eventUpdateId, String photo, Timestamp date) {
		super();
		this.photoId = photoId;
		this.eventId = eventId;
		this.eventUpdateId = eventUpdateId;
		this.photo = photo;
		this.date = date;
	}

	/**
	 * @return the photoId
	 */
	public Long getPhotoId() {
		return photoId;
	}

	/**
	 * @param photoId the photoId to set
	 */
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
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

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result + ((eventUpdateId == null) ? 0 : eventUpdateId.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result + ((photoId == null) ? 0 : photoId.hashCode());
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
		Photos other = (Photos) obj;
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
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		if (photoId == null) {
			if (other.photoId != null)
				return false;
		} else if (!photoId.equals(other.photoId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{photoId:" + photoId + ", eventId:" + eventId + ", eventUpdateId:" + eventUpdateId + ", photo:"
				+ photo + ", date:" + date + "}";
	}

	 
	
	
}
