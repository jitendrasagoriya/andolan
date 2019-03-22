package com.indian.andolan.endpoint;

import java.sql.Timestamp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indian.andolan.enums.Status;
import com.indian.andolan.model.Event;
import com.indian.andolan.service.impl.EventServiceImpl;
import com.indian.andolan.tokengenerator.SecureTokenGenerator;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(path = "api/event/", produces = { MediaType.APPLICATION_JSON_VALUE })
public class EventEndpoint {

	@Autowired
	private EventServiceImpl service;

	@GetMapping()
	public ResponseEntity<Page<Event>> get(Pageable pageable) {
		return new ResponseEntity<Page<Event>>(service.repository().findAll(pageable), HttpStatus.OK);
	}
	
	@GetMapping("active")
	public ResponseEntity<Page<Event>> getActive(Pageable pageable) {
		return new ResponseEntity<Page<Event>>(service.repository().getActive(Boolean.TRUE, pageable), HttpStatus.OK);
	}

	
	@GetMapping("{id}")
	public ResponseEntity<?> getById(@PathVariable String id) {
		return new ResponseEntity<Event>(service.repository().findById(id).get(), HttpStatus.OK);
	}
	
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Event> addEvent(@RequestBody @Valid Event event) {
		System.out.println( event);
		String id = SecureTokenGenerator.getToken();
		event.setEventId(id);
		event.setStartDate(new Timestamp(System.currentTimeMillis()));
		event.setIsActive(Boolean.FALSE);
		event.setEventLeaders(event.getAdmins());
		event.setStatus(Status.INPROGRESS);
		event.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		return new ResponseEntity<Event>(service.repository().save(event), HttpStatus.OK);
	}

	@DeleteMapping("{id}") 
	public ResponseEntity<?> delete(@PathVariable String id) {
		try {
			service.repository().deleteById(id);
			return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Exception>(e, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
