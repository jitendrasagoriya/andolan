package com.indian.andolan.endpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indian.andolan.enums.EventType;
import com.indian.andolan.enums.Gender;
import com.indian.andolan.enums.ParticipantType;
import com.indian.andolan.enums.Status;
import com.indian.andolan.model.KeyValuePair;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "api/utility/", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UtilityEndpoint {
	
	@GetMapping(path="eventtype")
	public ResponseEntity<?> getEventType(){
		List<KeyValuePair> list = new ArrayList<>(); 
		EventType.getMap().forEach((k,v)->{ list.add(new KeyValuePair(k, v));});
		Collections.sort(list);
		return new ResponseEntity<List<KeyValuePair>>(list, HttpStatus.OK);
	}
	
	@GetMapping(path="gender")
	public ResponseEntity<?> getGender(){
		List<KeyValuePair> list = new ArrayList<>(); 
		Gender.getMap().forEach((k,v)->{ list.add(new KeyValuePair(k, v));});
		Collections.sort(list);
		return new ResponseEntity<List<KeyValuePair>>(list, HttpStatus.OK);
	}
	
	@GetMapping(path="status")
	public ResponseEntity<?> getStatus(){
		List<KeyValuePair> list = new ArrayList<>(); 
		Status.getMap().forEach((k,v)->{ list.add(new KeyValuePair(k, v));});
		Collections.sort(list);
		return new ResponseEntity<List<KeyValuePair>>(list, HttpStatus.OK);
	}
	
	@GetMapping(path="participanttype")
	public ResponseEntity<?> getParticipantType(){
		List<KeyValuePair> list = new ArrayList<>(); 
		ParticipantType.getMap().forEach((k,v)->{ list.add(new KeyValuePair(k, v));});
		Collections.sort(list);
		return new ResponseEntity<List<KeyValuePair>>(list, HttpStatus.OK);
	}

}
