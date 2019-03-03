package com.indian.andolan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.indian.andolan.enums.Gender;
import com.indian.andolan.enums.Position;

@Entity
@Table(name = "MEMBER")
public class Member implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEMBERID")
	private Long memberId;

	@Column(name = "MEMBERNAME")
	private String memberName;

	@Column(name = "POSITION")
	private Position posiption;

	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private Gender gender;

	/**
	 * 
	 */
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param memberId
	 * @param memberName
	 * @param posiption
	 * @param userName
	 * @param password
	 * @param age
	 * @param gender
	 */
	public Member(Long memberId, String memberName, Position posiption, String userName, String password, int age,
			Gender gender) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.posiption = posiption;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.gender = gender;
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

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the posiption
	 */
	public Position getPosiption() {
		return posiption;
	}

	/**
	 * @param posiption the posiption to set
	 */
	public void setPosiption(Position posiption) {
		this.posiption = posiption;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((memberName == null) ? 0 : memberName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((posiption == null) ? 0 : posiption.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		Member other = (Member) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberName == null) {
			if (other.memberName != null)
				return false;
		} else if (!memberName.equals(other.memberName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (posiption != other.posiption)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{memberId:" + memberId + ", memberName:" + memberName + ", posiption:" + posiption
				+ ", userName:" + userName + ", password:" + password + ", age:" + age + ", gender:" + gender + "}";
	}
	
	

}
