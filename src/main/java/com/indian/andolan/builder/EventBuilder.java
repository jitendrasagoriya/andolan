package com.indian.andolan.builder;

import java.sql.Timestamp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.indian.andolan.enums.EventType;
import com.indian.andolan.enums.Status;
import com.indian.andolan.model.Event;

public class EventBuilder {
	
	public Event createDummyObject() {
		Event event = new Event();
		event.setAdmins("Admin");
		event.setCity("Bhopal");
		event.setCommitteeorstartby("Jitendra Sagoriya");
		event.setDistrict("Bhopal");
		event.setEmailId("jitendra.sagoriya@yahoo.co.in");
		event.setEventDescription("Discription of event");
		event.setEventLeaders("JItendra Sagoriya");
		event.setEventName("Hunger Strike againt Indian railways");
		event.setEventProblem("Event Problem");
		event.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		event.setMobileNumber("9769160936");
		event.setNumberOfParticipants(120);
		event.setPartySupported("BJP");
		event.setStartDate(new Timestamp(System.currentTimeMillis()));
		event.setTaluka("Kararaiya");
		event.setType(EventType.HUNGERSTRIK);
		event.setStatus(Status.INPROGRESS);
		event.setState("MP");
		event.setIsActive(Boolean.FALSE);
		return event;
	}
	
	public String createJsonString(Event event) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(event);
	}
	
	public static void main(String[] args) {
		EventBuilder builder = new EventBuilder();
		Event event = builder.createDummyObject();
		try {
			String eventJson = builder.createJsonString(event);
			System.out.println(eventJson);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
