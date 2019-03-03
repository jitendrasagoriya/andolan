package com.indian.andolan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.indian.andolan.enums.Position;

@Entity
@Table(name = "TEAM")
public class Team implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	@EmbeddedId
	private TeamPrimeryKey id;

	@Column(name = "POSITION")
	private Position position;

	/**
	 * 
	 */
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param position
	 */
	public Team(TeamPrimeryKey id, Position position) {
		super();
		this.id = id;
		this.position = position;
	}

	/**
	 * @return the id
	 */
	public TeamPrimeryKey getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(TeamPrimeryKey id) {
		this.id = id;
	}

	/**
	 * @return the position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
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
		Team other = (Team) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (position != other.position)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{id=" + id + ", position=" + position + "}";
	}

	 

}
